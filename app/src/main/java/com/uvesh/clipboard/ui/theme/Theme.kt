package com.uvesh.clipboard.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xff6200ee), // Example color
    onPrimary = Color.White,
    secondary = Color(0xff03dac6),
    onSecondary = Color.Black,
    background = Color.White,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Color.Black
)

private val DarkColors = darkColorScheme(
    primary = Color(0xffbb86fc), // Example color
    onPrimary = Color.Black,
    secondary = Color(0xff03dac6),
    onSecondary = Color.White,
    background = Color(0xff121212),
    onBackground = Color.White,
    surface = Color(0xff121212),
    onSurface = Color.White
)

@Composable
fun QuickClipboardTheme(darkTheme: Boolean = false, content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}