package com.example.personallist.model

import androidx.annotation.DrawableRes

data class PersonalList (
    val nameStr: String,
    val addressStr: String,
    @DrawableRes val photoUser: Int
)