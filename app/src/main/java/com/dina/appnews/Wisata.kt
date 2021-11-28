package com.dina.appnews

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wisata (
    var name: String?,
    var deskripsi: String?,
    var photo: Int = 0

        ) : Parcelable
