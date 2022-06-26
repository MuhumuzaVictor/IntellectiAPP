package com.viktadzy.intellectiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.viktadzy.intellectiapp.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var welcomeloginbtn= findViewById<Button>(R.id.welcome_login_button)
        welcomeloginbtn.setOnClickListener {
            val intent= Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }

        var welcomesignupbtn= findViewById<Button>(R.id.welcome_signup_button)
        welcomesignupbtn.setOnClickListener {
            val intent= Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}