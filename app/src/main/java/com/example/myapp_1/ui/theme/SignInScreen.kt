package com.example.myapp_1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp_1.R

@Composable
fun SignInScreen(
    onContinue: () -> Unit,
    onCreateAccount: () -> Unit,
    onForgotPassword: () -> Unit // still passed, but not used here
) {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Sign in", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        // Email Field
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email Address") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Continue Button
        Button(
            onClick = { onContinue() },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B5DE5))
        ) {
            Text("Continue", color = Color.White)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Create Account Option
        Row {
            Text("Don't have an Account? ")
            Text(
                text = "Create One",
                color = Color(0xFF9B5DE5),
                modifier = Modifier.clickable { onCreateAccount() }
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Social Buttons
        SocialSignInButton("Continue With Apple", R.drawable.apple_logo, {})
        Spacer(modifier = Modifier.height(12.dp))
        SocialSignInButton("Continue With Google", R.drawable.google_logo, {})
        Spacer(modifier = Modifier.height(12.dp))
        SocialSignInButton("Continue With Facebook", R.drawable.facebook_logo, {})
    }
}

@Composable
fun SocialSignInButton(text: String, iconResId: Int, onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text)
        }
    }
}
