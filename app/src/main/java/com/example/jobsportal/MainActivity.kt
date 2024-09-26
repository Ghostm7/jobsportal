package com.example.jobsportal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userSignUpButton = findViewById<Button>(R.id.userSignUpButton)
        userSignUpButton.setOnClickListener {
            // Navigate to User Sign Up Activity
            val intent = Intent(this, UserSignUpActivity::class.java)
            startActivity(intent)
        }

        val adminSignUpButton = findViewById<Button>(R.id.adminSignUpButton)
        adminSignUpButton.setOnClickListener {
            // Navigate to Admin Sign Up Activity
            val intent = Intent(this, AdminSignUpActivity::class.java)
            startActivity(intent)
        }

        // Other initializations...
    }
}




