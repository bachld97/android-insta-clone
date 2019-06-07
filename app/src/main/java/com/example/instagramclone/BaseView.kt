package com.example.instagramclone

interface BaseView<T : BasePresenter> {

    var presenter: T

}