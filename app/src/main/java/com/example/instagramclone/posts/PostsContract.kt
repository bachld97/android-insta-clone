package com.example.instagramclone.posts

import com.example.instagramclone.BasePresenter
import com.example.instagramclone.BaseView
import com.example.instagramclone.data.Post

interface PostsContract {

    interface View : BaseView<Presenter> {
        fun showLoadingIndicator()
        fun showPostDetailUi(requestedPost: Post)
        fun showShareUi(requestedPost: Post)
    }

    interface Presenter : BasePresenter {
        fun sendLike(post: Post)
        fun sendUnlike(post: Post)
        fun loadPosts(forceUpdate: Boolean)
        fun openDetail(requestedPost: Post)
        fun openShare(requestedPost: Post)
    }

}