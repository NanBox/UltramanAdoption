package com.example.androiddevchallenge.bean

import androidx.annotation.DrawableRes

data class Ultraman(
    val name: String,
    val height: String,
    val weight: String,
    val specialMoves: String,
    val intro: String,
    @DrawableRes val picture: Int,
)
