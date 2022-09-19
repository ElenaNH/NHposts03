package posts

data class Comments(
    val count: Int = 0,
    val canPost: Boolean = true,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)
