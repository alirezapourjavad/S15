package com.example.s15

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val name: String,
    val lastName: String,
    val age: Int
):Parcelable
