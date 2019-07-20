package com.example.cuisine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_link.*

class ShowLinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_link)

        var extras  = intent.extras
        if(extras != null)
        {
            var link = extras.get("link")  // the link which we passes in intent inside adapter

            webViewId.loadUrl(link.toString()) // accessing web using web view
        }
    }
}

