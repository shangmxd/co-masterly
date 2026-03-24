package com.example.comasterly.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.comasterly.ui.theme.rojerFlintFontFamily

@Composable
fun AddDailyHourScreen() {
    val mainBgColor = Color(0xFF8A9A78)

    var dailyHours by remember { mutableFloatStateOf(0.5f) }

    Box(modifier = Modifier.fillMaxSize()) {
        Surface(
            color = mainBgColor,
            modifier = Modifier.fillMaxSize()
        ) {}

        Column(modifier = Modifier.fillMaxSize()
            .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = ((dailyHours.toInt())/2f).toString(),
                fontFamily = rojerFlintFontFamily,
                fontSize = 140.sp
            )

            Text(
                text = "hours a day",
                fontFamily = rojerFlintFontFamily,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )

            Slider(
                value = dailyHours,
                onValueChange = { it: Float -> dailyHours = it },
                valueRange = 1f..48f,
            )

            Spacer(Modifier.height(48.dp))

            Button(onClick = {}) {
                Text(
                    text = "All done !",
                    fontSize = 24.sp
                )
            }
        }
    }
}

@Preview
@Composable
private fun AddDailyHourPreview() {
    AddDailyHourScreen()
}