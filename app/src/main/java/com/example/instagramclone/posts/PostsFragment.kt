package com.example.instagramclone.posts

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramclone.R
import com.example.instagramclone.data.Post

class PostsFragment: Fragment(), PostsContract.View {
    override lateinit var presenter: PostsContract.Presenter

    override var isActive: Boolean = true

    override fun onResume() {
        super.onResume()
        presenter.present()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // val root = inflater.inflate(R.layout.tasks_frag, container, false)
        TODO()
    }

    override fun showLoadingIndicator() {

    }

    override fun showError(error: Error) {

    }

    override fun showPosts(posts: List<Post>) {

    }

    override fun navigatePostDetailUi(requestedPost: Post) {

    }

    override fun navigateShareUi(requestedPost: Post) {

    }

    companion object {
        fun newInstance() = PostsFragment()
    }
}
