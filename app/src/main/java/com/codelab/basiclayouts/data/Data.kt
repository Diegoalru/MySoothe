package com.codelab.basiclayouts.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.codelab.basiclayouts.R

data class ImageTextPair(
    @DrawableRes val imageResId:Int,
    @StringRes val textResId: Int
)

private val alignYourBodyItems = listOf(
    ImageTextPair(R.drawable.ab1_inversions, R.string.ab1_inversions),
    ImageTextPair(R.drawable.ab2_quick_yoga, R.string.ab2_quick_yoga),
    ImageTextPair(R.drawable.ab3_stretching, R.string.ab3_stretching),
    ImageTextPair(R.drawable.ab4_tabata, R.string.ab4_tabata),
    ImageTextPair(R.drawable.ab5_hiit, R.string.ab5_hiit),
    ImageTextPair(R.drawable.ab6_pre_natal_yoga,R.string.ab6_pre_natal_yoga)
)

val alignYourBodyData: List<ImageTextPair>
    get() = alignYourBodyItems

private val favoriteCollectionItems = listOf(
    ImageTextPair(R.drawable.fc1_short_mantras, R.string.fc1_short_mantras),
    ImageTextPair(R.drawable.fc2_nature_meditations, R.string.fc2_nature_meditations),
    ImageTextPair(R.drawable.fc3_stress_and_anxiety, R.string.fc3_stress_and_anxiety),
    ImageTextPair(R.drawable.fc4_self_massage, R.string.fc4_self_massage),
    ImageTextPair(R.drawable.fc5_overwhelmed, R.string.fc5_overwhelmed),
    ImageTextPair(R.drawable.fc6_nightly_wind_down, R.string.fc6_nightly_wind_down)
)

val favoriteCollectionsData: List<ImageTextPair>
    get() = favoriteCollectionItems
