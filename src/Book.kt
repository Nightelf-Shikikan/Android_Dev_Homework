interface Borrowable {
    fun borrow(user: String)
}


class Book(
    override val id: Int,
    val title: String,
    val author: String,
    val year: Int,
    val genre: Genre
) : LibraryItem(id), Borrowable {

    override fun borrow(user: String) {
        println("$user borrowed \"$title\"")

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Book) return false

        return title == other.title &&
                author == other.author &&
                year == other.year &&
                genre == other.genre

    }


    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + author.hashCode()
        result = 31 * result + year
        result = 31 * result + genre.hashCode()
        return result

    }

}