package com.example.recyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Motivation (
    @StringRes val stringResourceID: Int,
    @DrawableRes val imageResourceID: Int)
