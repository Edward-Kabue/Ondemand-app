package com.ist.ondemand.data

data class ServicesData(
    val postId: String? = null,
    val userId: String? = null,
    val username: String? = null,
    val userImage: String? = null,
    val postImage: String? = null,
    val ServviceDescription: String? = null,
    val time: Long? = null,
) {
    fun toMap() = mapOf(
        "userId" to userId,
        "username" to username,
        "imageUrl" to userImage,
       " ServviceDescription" to ServviceDescription,
    )
}
