package com.example.education

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class SocialMedia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)
        //Simply setting a useful resource that can help parents and give advice for social media
        val media: WebView = findViewById<WebView>(R.id.media)
        media.loadUrl("https://www.internetmatters.org/hub/news-blogs/social-media-networks-made-for-kids/")
    }
}
