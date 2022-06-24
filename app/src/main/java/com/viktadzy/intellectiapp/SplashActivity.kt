package com.viktadzy.intellectiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.viktadzy.intellectiapp.ui.home.HomeFragment

class SplashActivity : AppCompatActivity() {
    private val splash_time_out=4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(
            {
                val i= Intent(this,HomeFragment::class.java)
                startActivity(i)
            },splash_time_out
        )
    }
}