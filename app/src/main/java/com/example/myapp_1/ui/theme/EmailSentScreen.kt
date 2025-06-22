package com.example.myapp_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EmailSentScreen(
    onReturnToLogin: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(24.dp)
        ) {
            // Mail Icon
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email Sent",
                modifier = Modifier.size(80.dp),
                tint = Color(0xFF9B6CFF)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Message
            Text(
                text = "We sent you an Email to reset\nyour password.",
                fontSize = 18.sp,
                color = Color.Black,
                lineHeight = 24.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Button
            Button(
                onClick = { onReturnToLogin() },
                modifier = Modifier
                    .width(200.dp)
                    .height(48.dp),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B6CFF))
            ) {
                Text(text = "Return to Login", color = Color.White)
            }
        }
    }
}
