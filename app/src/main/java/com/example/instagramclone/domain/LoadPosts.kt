package com.example.instagramclone.domain

import com.example.instagramclone.data.Post
import com.example.instagramclone.data.source.PostDataSource
import com.example.instagramclone.data.source.PostRepository

class LoadPosts(
    private val postRepository: PostRepository
): UseCase<Any?, List<Post>> {

    override fun execute(request: Any?, responseCallback: UseCase.ResponseCallback<List<Post>>) {
        val callback = object : PostDataSource.LoadPostsCallback {
            override fun onError(error: Error) {
                responseCallback.onFailure(error)
            }

            override fun onPostsLoaded(posts: List<Post>) {
                responseCallback.onSuccess(posts)
            }
        }

        postRepository.loadPosts(callback)
    }
}