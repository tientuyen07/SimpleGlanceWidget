package com.android.myglancewidget.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

val Primary = Color(0xFF1976D2)
val Secondary = Color(0xFFFFC107)
val BackgroundLight = Color(0xFFFFFFFF)
val BackgroundDark = Color(0xFF121212)
val ColorTitleLight = Color(0xFF121212)
val ColorTitleDark = Color(0xFFFFFFFF)

val LightColorScheme = lightColorScheme(
    primary = Primary,
    secondary = Secondary,
    background = BackgroundLight,
    onPrimary = Color.White
)

val DarkColorScheme = darkColorScheme(
    primary = Primary,
    secondary = Secondary,
    background = BackgroundDark,
    onPrimary = Color.White
)
