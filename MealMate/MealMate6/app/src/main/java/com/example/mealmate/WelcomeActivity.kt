package com.example.mealmate.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mealmate.R
import android.widget.Button
import android.widget.TextView
import com.example.mealmate.ui.login.LoginActivity
import com.example.mealmate.ui.login.RegisterActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val registerButton = findViewById<Button>(R.id.RegisterButton)
        registerButton.setOnClickListener {
            onRegisterButtonClicked(it)
        }
        // This is where the first snippet goes:
        val signInTextView = findViewById<TextView>(R.id.signInTextView)
        signInTextView.setOnClickListener {
            onSignInTextViewClicked(it)
        }
    }
    // This is where the second snippet goes:
    fun onRegisterButtonClicked(view: View) {
        println("Register button clicked!")
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
    fun onSignInTextViewClicked(view: View) {
        println("Sign In TextView clicked!")
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}