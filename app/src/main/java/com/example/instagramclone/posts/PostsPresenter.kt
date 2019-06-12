package com.example.instagramclone.posts

import com.example.instagramclone.data.Post
import com.example.instagramclone.domain.LoadPosts
import com.example.instagramclone.domain.UseCase
import com.example.instagramclone.util.applyIfExist
import java.lang.ref.WeakReference

// Use cases includes: Load posts, send like/unlike
class PostsPresenter(
    private val loadPosts: LoadPosts,
    view: PostsContract.View
): PostsContract.Presenter {

    private val weakView: WeakReference<PostsContract.View>
    private var firstLoad = false

    init {
        view.presenter = this
        weakView = WeakReference(view)
    }

    override fun present() {
        if (firstLoad) {
            weakView.applyIfExist {
                this.showLoadingIndicator()
            }
            firstLoad = false
        }
        loadPosts(true)
    }

    override fun loadPosts(forceUpdate: Boolean) {
        loadPosts.execute(null, object : UseCase.ResponseCallback<List<Post>> {
            override fun onSuccess(response: List<Post>) {
                weakView.applyIfExist {
                    if (this.isActive) {
                        this.showPosts(response)
                    }
                }
            }

            override fun onFailure(error: Error?) {
                weakView.applyIfExist {
                    if (this.isActive) {
                        // this.showError()
                    }
                }
            }

        })
    }

    override fun sendLike(post: Post) {
    }

    override fun sendUnlike(post: Post) {
    }

    override fun openDetail(requestedPost: Post) {
    }

    override fun openShare(requestedPost: Post) {
    }

}