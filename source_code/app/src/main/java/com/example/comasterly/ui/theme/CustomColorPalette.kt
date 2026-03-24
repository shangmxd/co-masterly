package com.example.comasterly.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorPalette(
    val customBackgroundColor: Color = Color.Unspecified,
    val customButtonColor:Color = Color.Unspecified
)

//Light Color
val spanishWhiteColor = Color(0xFFE9E1CD)
val mutedSageColor = Color(0xFF8A9A78)

//Dark Color
val darkGunMetalColor = Color(0xFF1A1C19)

val LightCustomColorPalette = CustomColorPalette(customBackgroundColor = mutedSageColor, customButtonColor = spanishWhiteColor)
val DarkCustomColorPalette = CustomColorPalette(customBackgroundColor = darkGunMetalColor)

val LocalCustomColorPalette = staticCompositionLocalOf { CustomColorPalette() }