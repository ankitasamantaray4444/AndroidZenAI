package com.example.myapp_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun ClotSplashScreen(onFinish: () -> Unit) {
    // Automatically navigate after delay
    LaunchedEffect(Unit) {
        delay(2000) // 2 seconds
        onFinish()
    }

    // UI part
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF9466F6)), // Purple background
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Clot",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontFamily = FontFamily.SansSerif
        )
    }
}
