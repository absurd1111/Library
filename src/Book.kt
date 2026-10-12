class Book (val name: String, val author: String, val year: Int, val genre: Genre, val status: BookStatus) {
    fun printBook(): String{
        return "$name \t $author \t $year \t $genre \t $status "
    }
}