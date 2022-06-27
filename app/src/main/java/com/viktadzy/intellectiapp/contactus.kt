package com.viktadzy.intellectiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class contactus : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_contactus, container, false)
        val myyweb = view.findViewById(R.id.myweb) as WebView
        myyweb.apply {
            loadUrl("http://intellectitechacademy.com/contact-us")
            webViewClient = WebViewClient();
            settings.javaScriptEnabled
        }


        return view
    }
}


