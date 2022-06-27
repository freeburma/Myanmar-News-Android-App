package com.example.mainmyanmarnewschannels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewsWebviewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val NUM_PAGES = 5

class NewsWebviewFragment(private val websiteName: String) : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        val myView = inflater.inflate(R.layout.fragment_news_webview, container, false);
        val newsWebView = myView.findViewById<WebView>(R.id.newsWebView)
//        newsWebView.loadUrl("https://www.google.com")
        newsWebView.loadUrl(websiteName)
        val newsWebViewSetting = newsWebView.settings
        newsWebViewSetting.javaScriptEnabled = true


        newsWebView.webViewClient = object : WebViewClient()
        {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean
            {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }

        return myView
    }// end onCreateView()




}// end class