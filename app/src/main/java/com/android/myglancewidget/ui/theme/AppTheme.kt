package com.android.myglancewidget.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (useDarkTheme) DarkColorScheme else LightColorScheme
    val typography = MyAppTypography(
        material = Typography(
            bodyLarge = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal),
            headlineSmall = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        ),
        customTextStyle = TextStyle(fontSize = 14.sp, color = if (useDarkTheme) ColorTitleDark else ColorTitleLight)
    )
    CompositionLocalProvider(LocalAppTypography provides typography) {
        MaterialTheme(
            colorScheme = colors,
            typography = typography.material,
            content = content
        )
    }

}
