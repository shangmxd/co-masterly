package com.example.comasterly.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath
import com.example.comasterly.R
import com.example.comasterly.ui.theme.rojerFlintFontFamily

@Composable
fun CreateSkillScreen() {
    val mainBgColor = Color(0xFF8A9A78)
//    val customBackgroundColor = LocalCustomColorPalette.current.customBackgroundColor
    Box {
        Surface(
            color = mainBgColor,
            modifier = Modifier.fillMaxSize()
        ) {
        }
        CreateSkillButton() {}
    }
}

@Composable
fun CreateSkillButton(onBtnClick: () -> Unit) {
    val previewColor = Color(0xFFE9E1CD)
    Box(
        modifier = Modifier
            .drawWithCache {
                val roundedPolygon = RoundedPolygon(
                    numVertices = 6,
                    radius = size.minDimension / 2,
                    centerX = size.width / 2,
                    centerY = size.height / 2,
                    rounding = CornerRounding(
                        size.minDimension / 7f,
                        smoothing = 0.1f
                    )
                )

                val roundedPolygonPath = roundedPolygon.toPath().asComposePath()
                onDrawBehind {
                    drawPath(roundedPolygonPath, color = previewColor)
                }
            }
            .fillMaxSize()
            .clickable(true, onClick = onBtnClick),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                painter = painterResource(R.drawable.plus_24px),
                contentDescription = "Plus icon",
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "CREATE\nSKILL",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                fontFamily = rojerFlintFontFamily,
                fontWeight = FontWeight.Normal
            )
        }
    }
}

@Preview
@Composable
private fun CreateSkillScreenPreview() {
    CreateSkillScreen()
}