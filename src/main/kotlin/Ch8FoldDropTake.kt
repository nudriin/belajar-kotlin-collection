package com.nudriin

fun main() {
    val numbers = listOf(1, 2, 3)

//    fold
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $foldRight")

//    drop
    val drop = numbers.drop(3) // mengahpus 3 data pertama
    val dropLast = numbers.dropLast(3) // menghapus 3 data terakhir
    println(drop)
    println(dropLast)

//    take
    val take = numbers.take(3) // mengambil 3 data pertama
    val takeLast = numbers.takeLast(3) // mengambil 3 data terakhir
}