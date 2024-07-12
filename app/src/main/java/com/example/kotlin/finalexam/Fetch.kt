package com.example.kotlin.finalexam

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Fetch {
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Int>()
    var n = 0
    var sum1 = 0
    var sum2 = 0


    suspend fun set1() {
        println("Enter the total number of elements in list1 and list2 : ")
        n = readln().toInt()

        for (i in 1..n) {
            println("Enter list 1  elements $i : ")
            var e = readln().toInt()
            list1.add(e)
            delay(3000)
        }
    }

    suspend fun set2() {

        for (i in 1..n) {

            println("Enter list 2 elements $i : ")
            var e = readln().toInt()
            list1.add(e)
            delay(2000)
        }
    }

    suspend fun sumofList1() {

        for (i in 0..n) {
            sum1 += list1[i]
        }
        println("Sum of list1 : $sum1")
        delay(1000)
    }

    suspend fun sumofList2() {

        for (j in 0..n) {
            sum2 += list1[j]
        }
        println("Sum of list2 : $sum2")
    }

    suspend fun sumof2List() {
        println("Sum of list1 and list2 : ${sum1 + sum2}")
    }
}

fun main() {
    var f1 = Fetch()

    runBlocking {
        launch {
            f1.set1()
        }
        launch {
            f1.set2()
        }
    }
    runBlocking {
        async {
            f1.sumofList1()
        }.await()
        async {
            f1.sumofList2()
        }.await()
        async {
            f1.sumof2List()
        }.await()
    }
}
