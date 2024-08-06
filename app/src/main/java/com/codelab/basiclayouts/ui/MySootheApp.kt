package com.codelab.basiclayouts.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.screen.MySootheAppLandscape
import com.codelab.basiclayouts.ui.screen.MySootheAppPortrait

@Composable
fun MySootheApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            MySootheAppPortrait()
        }

        WindowWidthSizeClass.Expanded -> {
            MySootheAppLandscape()
        }
    }
}

@Preview(widthDp = 640, heightDp = 360)
@Composable
fun MySootheAppLandscapePreview() {
    MySootheAppLandscape()
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MySootheAppPortraitPreview() {
    MySootheAppPortrait()
}
