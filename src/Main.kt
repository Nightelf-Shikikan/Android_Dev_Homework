//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun main() {

    val Book_01 = Book(id = 3456, title = "Starship Troopers", author = "Robert Heinlein", year = 1967, Genre.SCI_FI)
    val Book_02 = Book(id = 3226, title = "Steel Rat", author = "Harry Harrison", year = 1977, Genre.SCI_FI)
    val Book_03 = Book(id = 1111, title = "Dune", author = "Frank Herbert", year = 1966, Genre.SCI_FI)
    val Book_04 = Book(id = 3760, title = "Lord of Light", author = "Roger Zelazny", year = 1987, Genre.SCI_FI)

    Book_01.borrow("Alice")
    Book_02.borrow("Bob")

    println(Book_01 == Book_02)  // false
    println(Book_01 == Book_01)  // true
    println(Book_01.hashCode())

}

