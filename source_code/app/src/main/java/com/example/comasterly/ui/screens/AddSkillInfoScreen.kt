package com.example.comasterly.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.comasterly.R
import com.example.comasterly.ui.theme.rojerFlintFontFamily

@Composable
fun AddSkillInfoScreen(onProceedBtnClick: ()->Unit) {
    val mainBgColor = Color(0xFF8A9A78)
    var skillTitle by remember { mutableStateOf("") }
    var totalHours by remember { mutableFloatStateOf(300f) }
    Box(modifier = Modifier.fillMaxSize()) {
        Surface(
            color = mainBgColor,
            modifier = Modifier.fillMaxSize()
        ) {}

        Column(modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Your Skill Title",
                fontFamily = rojerFlintFontFamily,
                fontSize = 24.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(top = 24.dp)
            )

            TextField(
                value = skillTitle,
                onValueChange = { it: String -> skillTitle = it },
                placeholder = { Text(text = "Swimming") },
                modifier = Modifier.align(Alignment.Start)
                    .padding(top = 24.dp),
                shape = RoundedCornerShape(corner = CornerSize(10.dp))
            )

            Spacer(Modifier.height(160.dp))
            Text(
                text = totalHours.toInt().toString(),
                fontFamily = rojerFlintFontFamily,
                fontSize = 140.sp
            )
            Text(
                text = "total hours",
                fontFamily = rojerFlintFontFamily,
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            Slider(
                value = totalHours,
                onValueChange = { it: Float -> totalHours = it },
                valueRange = 10f..1000f,
            )

            Spacer(Modifier.height(48.dp))

            Button(onClick = onProceedBtnClick) {
                Text(
                    text = "Set your daily time!"
                )
                Icon(
                    painter = painterResource(R.drawable.arrow_forward_24px),
                    contentDescription = "Next Page Arrow"
                )
            }
        }
    }
}

@Preview
@Composable
private fun AddSkillInfoPreview() {
    AddSkillInfoScreen(){}
}