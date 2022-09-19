package posts

data class Post(
    val id: Int = -1,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int? = null,
    val date: Int = (System.currentTimeMillis() / 86400000).toInt(),
    val text: String = "",
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
    val views: Views = Views(),
    val postType: String = "post",
    val canPin: Boolean = true,
    val isPinned: Boolean = true
) /*{
    override fun toString(): String {
        val friendsOnlyStr = if (friendsOnly) ", friendsOnly" else ""
        val canPinStr = if (canPin) ", canPin" else ""
        val isPinnedStr = if (isPinned) ", isPinned" else ""
        return """======= POST id=${id} ========
            |ownerID=${ownerId}, fromId=${fromId}, daysOfEpoch=${date},
            |postType=${postType}${friendsOnlyStr}${canPinStr}${isPinnedStr}
            |---
            |${text}
            |---
            |likes=${likes}, views=${views}
            |---------------------------------
            |""".trimMargin()
    }
}*/
