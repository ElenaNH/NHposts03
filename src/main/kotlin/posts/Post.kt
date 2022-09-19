package posts

data class Post(
    val id: Int = -1,
    val ownerId: Int,
    val fromId: Int,
    val date: Int = (System.currentTimeMillis() / 86400000).toInt(),
    val text: String = "",
    val friendsOnly: Boolean = true, /* Наверное, это тоже должно быть Boolean */
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
