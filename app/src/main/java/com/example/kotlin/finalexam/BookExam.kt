package com.example.kotlin.finalexam

data class Book(
    var title: String = "",
    var author: String = "",
    var year: Int = 0
)

class Library {
    var book = mutableListOf<Book>()

    fun addBook(books: Book) {
        book.add(books)
    }

    fun removeABook() {
        println("Enter the Title of the Book : ")
        var title = readln()

        for (i in 0..<book.size) {
            if (book[i].title == title) {
                book.removeAt(i)
            }
        }
        println("Book Removed")
    }

    fun findBook() {
        println("Enter the Title of the Book : ")
        var title = readln()
        for (i in 0..<book.size) {
            if (book[i].title == title) {
                println(book[i])
            }
        }
    }
    fun display() {
        book.sortBy { it.year }
        println((book))

    }
}
fun main() {
    var l1 = Library()

    println("Enter the total number of Books : ")
    var n = readln().toInt()

    for (i in 1..n) {
        println("Enter the Title of the Book $i: ")
        var title = readln()

        println("Enter the Author of the Book $i: ")
        var author = readln()

        println("Enter the Year of the Book $i: ")
        var year = readln().toInt()

        var book = Book(title, author, year)
        l1.addBook(book)

    }
    do {
        println("Press 1 to Add Book ")
        println("Press 2 to Remove Book ")
        println("Press 3 to Find Book ")
        println("Press 4 to Display Book ")
        println("Press 5 to Exit ")
        var ch = readln().toInt()

        when (ch) {
            1 -> {
                println("Enter the Title of the Book : ")
                var title = readln()

                println("Enter the Author of the Book $title: ")
                var author = readln()

                println("Enter the Year of the Book $title: ")
                var year = readln().toInt()

                var book = Book(title, author, year)
                l1.addBook(book)
            }

            2 -> {
                l1.removeABook()
            }

            3 -> {
                l1.findBook()
            }

            4 -> {
                l1.display()
            }
            5 -> {
                println("Exit")
            }
        }
    } while (ch != 5)
}
