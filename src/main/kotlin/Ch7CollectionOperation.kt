package com.nudriin

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    filter and filterNot
    val evenList = numberList.filter { it % 2 == 0 } // menggunakan filter mengahsilkan bilangan bulat
    val oddList = numberList.filterNot { it % 2 == 0 } // filter not, sebaliknya
    println(evenList)
    println(oddList)
// "it" pada kode di atas akan merepresentasikan masing-masing item pada numberList

//    map
    val mapList = numberList.map { it * 2 }
    println(mapList)

//    count
    val countList = numberList.count() // menghitung jumlah datanya
    println(countList)

//    find, firstOrNull
    val findList = numberList.find { it + 2 == 4 }
    val firstOrNull = numberList.firstOrNull() { it + 3 == 4 }
    println(findList)
    println(firstOrNull)

//    first
    val first = numberList.first { it > 2 } //3
    println(first)

//    sum
    val sum = numberList.sum()
    println(sum)

//    sorted
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() // asc
    val descendingSort = kotlinChar.sortedDescending() // desc
    println(ascendingSort)
    println(descendingSort)
}