package com.viktadzy.intellectiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class courses : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_courses, container, false)
        val myweb = view.findViewById(R.id.myweb1) as WebView
        myweb.apply {
            loadUrl("http://intellectitechacademy.com/courses")
            webViewClient = WebViewClient();
            settings.javaScriptEnabled
        }
        return view

    }
}