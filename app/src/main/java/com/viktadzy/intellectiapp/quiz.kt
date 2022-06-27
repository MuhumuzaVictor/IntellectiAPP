package com.viktadzy.intellectiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class quiz : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_quiz, container, false)
        val mywebb = view.findViewById(R.id.my2web) as WebView
        mywebb.apply {
            loadUrl("http://intellectitechacademy.com/quizzes")
            webViewClient = WebViewClient();
            settings.javaScriptEnabled
        }
        return view

    }


    }
