package com.example.forgot_password_page

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.forgot_password_page.models.Cart
import com.example.forgot_password_page.models.CreatePassword
import com.example.forgot_password_page.models.Dashboard
import com.example.forgot_password_page.models.FarmTech
import com.example.forgot_password_page.models.Favourite
import com.example.forgot_password_page.models.ForgotPassword
import com.example.forgot_password_page.models.Login


@Composable
fun MainScreen() {
        val navController = rememberNavController()

        NavHost(navController, startDestination = ForgotPassword.route) {
            composable(ForgotPassword.route) { backStackEntry ->
                backStackEntry.arguments?.getString("email") ?: ""
                ForgotPasswordScreen(navController = navController)
            }
            composable(Login.route) { backStackEntry ->
                backStackEntry.arguments?.getString("email") ?: ""
                LoginScreen(navController = navController)
            }
            composable(CreatePassword.route) { backStackEntry ->
                backStackEntry.arguments?.getString("email") ?: ""
                CreatePasswordScreen(navController = navController)
            }
            composable(Dashboard.route) {
                DashboardScreen(navController = navController)
            }
            composable(FarmTech.route) {
                FarmTechPage(navController = navController)
            }
            // Add routes for Cart and Favorite pages
            composable(Cart.route) {
                CartPage(navController = navController)
            }
            composable(Favourite.route) {
                FavoritePage(navController = navController)
            }
        }
    }

