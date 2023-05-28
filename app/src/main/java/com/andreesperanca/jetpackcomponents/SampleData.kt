package com.andreesperanca.jetpackcomponents

import androidx.annotation.DrawableRes

data class HighlightGroup(
    @DrawableRes val image: Int,
    val name: String
)

val highLightGroups = listOf(
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo")
)



