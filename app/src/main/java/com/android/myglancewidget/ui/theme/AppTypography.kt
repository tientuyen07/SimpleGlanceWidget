package com.android.myglancewidget.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

data class MyAppTypography(
    val material: Typography,
    val customTextStyle: TextStyle
)

val LocalAppTypography = staticCompositionLocalOf {
    MyAppTypography(
        material = Typography(),
        customTextStyle = TextStyle.Default
    )
}
