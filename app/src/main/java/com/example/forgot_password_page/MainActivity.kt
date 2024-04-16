package com.example.forgot_password_page

import android.graphics.fonts.FontStyle
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.material.lightColors
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.forgot_password_page.ui.theme.Typography

class ForgotPasswordActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                MainScreen(navController = rememberNavController())
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ColorScheme(primary = Color.Red, onPrimary = Color.Red, primaryContainer = Color.Red
        , inversePrimary = Color.Black, onBackground = Color.White,
            onPrimaryContainer = Color.White, secondary = Color.Red,
            error = Color.Red, onSecondary = Color.Black, onSecondaryContainer = Color.Black, secondaryContainer = Color.White, tertiary = Color.White, onTertiary = Color.Blue,
        onError = Color.Blue, tertiaryContainer = Color.Black, onErrorContainer = Color.Red,
            onSurface = Color.Blue, onTertiaryContainer = Color.Black,
            background = Color.Red,
            onSurfaceVariant = Color.Gray, surface = Color.Red, surfaceVariant = Color.Gray, surfaceTint = Color.Gray,
            inverseOnSurface = Color.Black, inverseSurface = Color.Black, errorContainer = Color.Gray, outline = Color.Gray, scrim = Color.Red,
            outlineVariant = Color.Red),

        typography = MaterialTheme.typography,

    ) {
        content()
    }
}

