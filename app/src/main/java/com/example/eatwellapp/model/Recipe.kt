package com.example.eatwellapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
)
