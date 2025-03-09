package io.github.flss2502.traveflow.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Định nghĩa 4 màu chủ đạo
val MainPrimary = Color(0xFFB7B1F2)    // Màu chủ đạo 1: B7B1F2
val MainSecondary = Color(0xFFFDB7EA)  // Màu chủ đạo 2: FDB7EA
val MainTertiary = Color(0xFFFFDCCC)   // Màu chủ đạo 3: FFDCCC
val MainBackground = Color(0xFFFBF3B9)  // Màu chủ đạo 4: FBF3B9

// Light Color Scheme cho màn hình chính
private val MainLightColorScheme = lightColorScheme(
    primary = MainPrimary,
    secondary = MainSecondary,
    tertiary = MainTertiary,
    background = MainBackground,
    surface = MainBackground,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onTertiary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

// Dark Color Scheme cho màn hình chính (tùy chỉnh theo ý muốn dark mode)
private val MainDarkColorScheme = darkColorScheme(
    primary = MainPrimary,
    secondary = MainSecondary,
    tertiary = MainTertiary,
    background = MainBackground,
    surface = MainBackground,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun MainScreenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> MainDarkColorScheme
        else -> MainLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // Giả sử Typography đã được định nghĩa ở file Typography.kt
        content = content
    )
}
