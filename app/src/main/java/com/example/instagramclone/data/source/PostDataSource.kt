package com.example.instagramclone.data.source

import com.example.instagramclone.data.Post

interface PostDataSource {

    interface LoadPostsCallback {

        fun onTasksLoaded(posts: List<Post>)

        fun onDataNotAvailable()

    }

    fun loadPosts(onComplete: LoadPostsCallback)

    fun likePost(post: Post)

    fun unlikePost(post: Post)

    fun sharePost(post: Post)

    fun uploadPost(post: Post)

}