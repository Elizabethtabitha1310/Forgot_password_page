package com.example.forgot_password_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ForgotPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

