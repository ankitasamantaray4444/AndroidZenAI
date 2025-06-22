package com.example.myapp_1.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color.White
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "splash",
            modifier = Modifier.padding(paddingValues)
        ) {

            // 1. Splash Screen
            composable("splash") {
                ClotSplashScreen {
                    navController.navigate("signin_email")
                }
            }

            // 2. Sign-In: Email entry
            composable("signin_email") {
                SignInScreen(
                    onContinue = {
                        navController.navigate("signin_password")
                    },
                    onCreateAccount = {
                        navController.navigate("signin_password")
                    },
                    onForgotPassword = {
                        navController.navigate("forgot_password")
                    }
                )
            }

            // 3. Sign-In: Password entry
            composable("signin_password") {
                PasswordScreenActivity(
                    onContinue = {
                        navController.navigate("info_screen")
                    },
                    onForgotPassword = {
                        navController.navigate("create_account")
                    }
                )
            }

            // 4. Create Account
            composable("create_account") {
                CreateAccountScreen(
                    onContinue = {
                        navController.navigate("info_screen")
                    },
                    onForgotPassword = {
                        navController.navigate("forgot_password")
                    }
                )
            }

            // 5. Forgot Password
            composable("forgot_password") {
                ForgotPasswordScreen(
                    onContinue = {
                        navController.navigate("email_sent")
                    }
                )
            }

            // 6. Email Sent Confirmation
            composable("email_sent") {
                EmailSentScreen(
                    onReturnToLogin = {
                        navController.navigate("signin_email") {
                            popUpTo("signin_email") { inclusive = true }
                        }
                    }
                )
            }

            // 7. Info Screen
            composable("info_screen") {
                InfoScreen(
                    onFinish = {
                        // Go to main dashboard or complete onboarding
                    }
                )
            }
        }
    }
}
