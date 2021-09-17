package com.example.businesslisting

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
class ItemDataModel(
    val card_title_text: Int,
    val card_secondary_text: Int,
    val card_supporting_text: Int,
    val card_image: Int):Parcelable