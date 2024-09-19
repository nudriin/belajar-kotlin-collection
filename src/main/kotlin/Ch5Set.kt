package com.nudriin

fun main() {
// set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik
    val integerSet = setOf(1, 2, 4, 2, 1, 5) // beberapa angka duplikat
    val stringSet: Set<String> = setOf("Hishasy", "Sunny", "Hishasy") // ada beberapa string dupolikat

    println(integerSet)
    println(stringSet)

    println("Nudrinn" in stringSet) // false
    println("Hishasy" in stringSet) // true

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    println(5 in setA)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}