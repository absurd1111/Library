fun main() {
    val mastandmarg = Book(name = "Мастер и Маргарита", author = "Булгаков", year = 1967, Genre.FICTION, BookStatus.AVAILABLE)
    val warAndPeace = Book(name = "Война и мир", author = "Толстой", year = 1869, Genre.FICTION, BookStatus.AVAILABLE)
    val crimeAndPunishment = Book(name = "Преступление и наказание", author = "Достоевский", year = 1866, Genre.FICTION, BookStatus.AVAILABLE)
    val deadSouls = Book(name = "Мертвые души", author = "Гоголь", year = 1842, Genre.FICTION, BookStatus.BORROWED)
    val nineteenEightyFour = Book(name = "1984", author = "Оруэлл", year = 1949, Genre.FICTION, BookStatus.RESERVED)

    val theHobbit = Book(name = "Хоббит", author = "Толкин", year = 1937, Genre.FANTASY, BookStatus.AVAILABLE)
    val harryPotter = Book(name = "Гарри Поттер и философский камень", author = "Роулинг", year = 1997, Genre.FANTASY, BookStatus.AVAILABLE)

    val sherlockHolmes = Book(name = "Приключения Шерлока Холмса", author = "Конан Дойл", year = 1892, Genre.DETECTIVE, BookStatus.AVAILABLE)
    val murderOnOrientExpress = Book(name = "Убийство в Восточном экспрессе", author = "Кристи", year = 1934, Genre.DETECTIVE, BookStatus.ARCHIVED)

    val briefHistoryOfTime = Book(name = "Краткая история времени", author = "Хокинг", year = 1988, Genre.SCIENTIFIC, BookStatus.AVAILABLE)
    val originOfSpecies = Book(name = "Происхождение видов", author = "Дарвин", year = 1859, Genre.SCIENTIFIC, BookStatus.ARCHIVED)

    val steveJobs = Book(name = "Стив Джобс", author = "Айзексон", year = 2011, Genre.BIOGRAPHY, BookStatus.BORROWED)
    val diaryOfAnneFrank = Book(name = "Дневник Анны Франк", author = "Франк", year = 1947, Genre.BIOGRAPHY, BookStatus.LOST)

    val theLittlePrince = Book(name = "Маленький принц", author = "Сент-Экзюпери", year = 1943, Genre.CHILDREN, BookStatus.AVAILABLE)
    val aliceInWonderland = Book(name = "Алиса в Стране чудес", author = "Кэрролл", year = 1865, Genre.CHILDREN, BookStatus.RESERVED)

}