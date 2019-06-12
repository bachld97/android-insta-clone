package com.example.instagramclone.util

import java.lang.ref.WeakReference

fun <T> WeakReference<T>.applyIfExist(action: T.() -> Unit) {
    this.get()?.apply {
        action()
    }
}
