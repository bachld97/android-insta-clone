package com.example.instagramclone

import android.content.Context
import com.example.instagramclone.data.source.PostRepository
import com.example.instagramclone.domain.LoadPosts
import com.example.instagramclone.posts.PostsContract
import com.example.instagramclone.posts.PostsPresenter

object Injection {
    // Need context for database
    fun getPostRepository(context: Context): PostRepository {
        return PostRepository()
    }

    fun getPostsPresenter(context: Context, view: PostsContract.View): PostsPresenter {
        val postRepo =  getPostRepository(context)
        val loadPosts = LoadPosts(postRepo)
        return PostsPresenter(loadPosts, view)
    }
}