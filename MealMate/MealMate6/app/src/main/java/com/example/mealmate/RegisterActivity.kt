package com.example.mealmate.ui.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mealmate.MainActivity
import com.example.mealmate.R
import com.example.mealmate.ui.login.LoginActivity

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerButton = findViewById<Button>(R.id.button1)
        registerButton.setOnClickListener {
            onRegisterButtonClicked()
        }
        val signInTextView = findViewById<TextView>(R.id.textView6)
        signInTextView.setOnClickListener {
            onSignInTextViewClicked()
        }
    }

    private fun onRegisterButtonClicked() {
        println("Register button clicked!")
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    private fun onSignInTextViewClicked() {
        println("Sign In TextView clicked!")
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}