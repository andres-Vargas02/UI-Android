package com.uptc.app1.utils

import android.content.Context
import android.widget.Toast

fun Context.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}
