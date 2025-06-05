package com.android.myglancewidget

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.ContentScale
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider

class StreakWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            MyStreak()
        }
    }

    @SuppressLint("RestrictedApi")
    @Composable
    private fun MyStreak(
        modifier: GlanceModifier = GlanceModifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA))
            .padding(16.dp)
    ) {
        Column(
            modifier = GlanceModifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.Horizontal.CenterHorizontally
        ) {
            Image(
                provider = ImageProvider(R.drawable.ic_fire_streak),
                contentDescription = "Image for Streak",
                modifier = GlanceModifier.width(60.dp).height(60.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = GlanceModifier.height(8.dp))
            Text(
                text = "Glance Widget",
                style = TextStyle(fontSize = 18.sp, color = ColorProvider(Color.Black))
            )
        }
    }
}