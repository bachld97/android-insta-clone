package com.example.instagramclone.data.source

import com.example.instagramclone.data.Post

interface PostDataSource {

    interface LoadPostsCallback {
        fun onPostsLoaded(posts: List<Post>)
        fun onError(error: Error)
    }

    fun loadPosts(callback: LoadPostsCallback)

    fun likePost(post: Post)

    fun unlikePost(post: Post)

    fun sharePost(post: Post)

    fun uploadPost(post: Post)

}