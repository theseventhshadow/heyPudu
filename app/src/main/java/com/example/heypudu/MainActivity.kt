package com.example.heypudu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.heypudu.features.welcome.presentation.screen.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier,
                color = MaterialTheme.colorScheme.background
            ) {
                WelcomeScreen(
                    onSignIn = { /* TODO: Navegar a pantalla de iniciar sesión */ },
                    onSignUp = { /* TODO: Navegar a pantalla de registro */ }
                )
            }
        }
    }
}
