package com.example.instagramclone

import android.content.Context
import com.example.instagramclone.data.source.PostRepository

object Injection {
    // Need context for database
    fun getPostRepository(context: Context): PostRepository {
        return PostRepository()
    }
}