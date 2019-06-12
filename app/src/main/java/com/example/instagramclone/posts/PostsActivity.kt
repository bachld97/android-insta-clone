package com.example.instagramclone.posts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.instagramclone.Injection
import com.example.instagramclone.R
import com.example.instagramclone.util.replaceFragmentInActivity


class PostsActivity : AppCompatActivity() {

    private lateinit var postsPresenter: PostsContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.posts_activity)

        val fragmentId = R.id.content_frame
        val postsFragment = supportFragmentManager.findFragmentById(
            fragmentId
        ) as PostsFragment? ?: PostsFragment.newInstance().also {
            replaceFragmentInActivity(it, fragmentId)
        }

        postsPresenter = Injection.getPostsPresenter(applicationContext, postsFragment)
    }
}

