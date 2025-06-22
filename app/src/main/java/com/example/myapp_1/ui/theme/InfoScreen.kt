package com.example.myapp_1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoScreen(onFinish: () -> Unit) {
    var selectedGender by remember { mutableStateOf("Men") }
    var expanded by remember { mutableStateOf(false) }
    var selectedAge by remember { mutableStateOf("Age Range") }

    val ageOptions = listOf("18 - 24", "25 - 34", "35 - 44", "45+")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Tell us About yourself",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Gender selection
            Text("Who do you shop for?", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(12.dp))
            Row {
                GenderOption("Men", selectedGender == "Men") { selectedGender = "Men" }
                Spacer(modifier = Modifier.width(16.dp))
                GenderOption("Women", selectedGender == "Women") { selectedGender = "Women" }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Age dropdown
            Text("How Old are you?", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color(0xFFF5F5F5), RoundedCornerShape(28.dp))
                    .clickable { expanded = true }
                    .padding(horizontal = 20.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = selectedAge, fontSize = 16.sp)
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown Icon",
                        tint = Color.Black
                    )
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    ageOptions.forEach { age ->
                        DropdownMenuItem(
                            text = { Text(age) },
                            onClick = {
                                selectedAge = age
                                expanded = false
                            }
                        )
                    }
                }
            }
        }

        // Finish Button
        Button(
            onClick = { onFinish() },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B70F9))
        ) {
            Text("Finish", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        }
    }
}

@Composable
fun GenderOption(label: String, selected: Boolean, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .background(
                color = if (selected) Color(0xFF9B70F9) else Color(0xFFF5F5F5),
                shape = CircleShape
            )
            .clickable { onClick() }
            .padding(horizontal = 32.dp, vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = if (selected) Color.White else Color.Black
        )
    }
}
