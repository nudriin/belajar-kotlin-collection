package com.nudriin


fun main(){
    // membuat list
    // list ini bersifat immutable
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

    println(numberList[4])

    for (value in anyList) {
        println(value)
    }

    for (value in charList) {
        println(value)
    }

    // Mutable list
    // dapat diubah dan dimanipulasi datanya
    val mutList: MutableList<String> = mutableListOf("Nurdin", "Hishasy", "Sunny", "Summer")
    mutList.add("Gaara") // menambah di akhir
    mutList.add(1,"Kisame") // menambah di index ke dua
    mutList[3] = "Moon"
    mutList.removeAt(4) // menghapus data pada index 4

    for (value in mutList){
        println(value)
    }

}
