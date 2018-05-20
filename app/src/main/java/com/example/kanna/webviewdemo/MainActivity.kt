package com.example.kanna.webviewdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    var et1:EditText?=null
    var wview:WebView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1=findViewById(R.id.et1)
        wview = findViewById(R.id.wview)
        wview?.webViewClient = WebViewClient()

    }
    fun load(v: View)

    {
        var WebSettings=wview?.settings
        WebSettings?.javaScriptEnabled=true
        when(v.id){
            R.id.search -> wview?.loadUrl(et1?.text.toString())

            R.id.google -> wview?.loadUrl("http://www.google.com")

            R.id.facebook -> wview?.loadUrl("http://www.facebook.com")

            R.id.youtube -> wview?.loadUrl("http://www.youtube.com")

            R.id.music  -> wview?.loadUrl("http://www.gaana.com")

        }

    }

    override fun onBackPressed() {
        if (wview?.canGoBack()!!)
        {
            wview?.goBack()
        }
        else {
            super.onBackPressed()
        }

    }
}
