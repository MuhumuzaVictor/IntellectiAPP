package com.viktadzy.intellectiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.viktadzy.intellectiapp.ui.home.HomeFragment

class SignUpActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Initialize Firebase Auth
        auth = Firebase.auth


        val logintext = findViewById<TextView>(R.id.goTologin)
        logintext.setOnClickListener {
            val intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

        val signupbtn = findViewById<Button>(R.id.signupbutton)
        signupbtn.setOnClickListener {
            performSignUp()
        }

        //lets get the email and password for the user

        performSignUp()
    }
    private fun performSignUp(){
    val email = findViewById<EditText>(R.id.signupEmail)
    val passwod= findViewById<EditText>(R.id.signupPassword)

    if(email.text.isEmpty() || passwod.text.isEmpty()){
        Toast.makeText(this,"please fill all the fields", Toast.LENGTH_SHORT)
            .show()
        return
    }

    val inputEmail = email.text.toString()
    val inputPassword = passwod.text.toString()

    auth.createUserWithEmailAndPassword(inputEmail,inputPassword)
    .addOnCompleteListener(this) { task ->
        if (task.isSuccessful) {
            // Sign in success, move to the next activity i.e Main activity

            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)

            Toast.makeText(
                baseContext, "Successful login.",
                Toast.LENGTH_SHORT
            ).show()

        } else {
            // If sign in fails, display a message to the user.

            Toast.makeText(
                baseContext, "Authentication failed.",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
    .addOnFailureListener {
        Toast.makeText(this,"Error occured ${it.localizedMessage}", Toast.LENGTH_SHORT)
            .show()
    }

}
}