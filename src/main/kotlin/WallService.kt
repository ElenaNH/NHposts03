import posts.*

object WallService {
    private var posts = emptyArray<Post>()
    private var nextPostId = 0

    fun add(post: Post): Post {
        // Посты на стене могут иметь один из 5 типов
        val postTypeNew = when (post.postType) {
            "post", "copy", "reply", "postpone", "suggest" -> post.postType
            else -> "post"
        }
        posts += post.copy(id = nextPostId++, postType = postTypeNew)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var postFound = false
        for ((index, storedPost) in posts.withIndex()) {
            if (storedPost.id == post.id) {
                postFound = true
                // id так и так одинаковый
                // скопируем весь новый пост, но при этом владельца и дату создания возьмем из старого
                // считаю нелогичным менять тип поста, так что тоже возьмем его из старого
                posts[index] = post.copy(
                    ownerId = storedPost.ownerId,
                    date = storedPost.date,
                    postType = storedPost.postType
                )
            }
        }
        return postFound
    }

    fun clear() {
        posts = emptyArray()
        nextPostId = 0
    }

    /*

        // Жалко было удалять код из лекции, так что чуточку его подправила
        fun likeById(id: Int) {
            for ((index, post) in posts.withIndex()) {
                if (post.id == id) {
                    posts[index] = post.copy(likes = post.likes.copy(post.likes.count + 1))
                }
            }
        }

        override fun toString(): String {
            var wallDisplay = ""
            for (post in posts) {
                wallDisplay += post.toString()
            }

            return wallDisplay
        }
    */

}
