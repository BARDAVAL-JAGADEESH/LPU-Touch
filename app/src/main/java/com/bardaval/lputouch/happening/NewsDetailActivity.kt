package com.bardaval.lputouch.happening

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.bardaval.lputouch.R

class NewsDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val webView: WebView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient()

        // Get the URL from the intent
        val url = intent.getStringExtra("url")
        if (url != null) {
            webView.loadUrl(url)
        }
    }
}
