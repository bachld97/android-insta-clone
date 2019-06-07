package com.example.instagramclone.data

import com.example.instagramclone.util.Image


class PostComment(
    val creator: User,
    val ageInSeconds: Long
)

class PostContent(
    val caption: String,
    val images: List<Image>,
    val likeCount: Int,
    var likedByMe: Boolean,
    val ageInSeconds: Long
)

class Post(
    val creator: User,
    val content: PostContent,
    val comments: List<PostComment>
)
