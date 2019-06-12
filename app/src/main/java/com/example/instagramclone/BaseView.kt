package com.example.instagramclone

interface BaseView<T : BasePresenter> {
    var presenter: T
    var isActive: Boolean

    fun showError(error: Error)
}