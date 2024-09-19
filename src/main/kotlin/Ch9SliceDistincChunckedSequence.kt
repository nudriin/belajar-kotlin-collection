package com.nudriin

fun main() {
    var total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var slice = total.slice(3..6) // dimulai dari 3 data sampai index ke 6

    println(slice)

    total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val index = listOf(2, 3, 5, 8)
    slice = total.slice(index)
    println(slice)

    // Distinct
    // memfilter hanya data yang berebeda saja
    total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5) // ada beberapa yang duplikat
    var distinct = total.distinct()

    println(distinct)

    total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    distinct = total.distinct()

    println(distinct)

    // Chunked
    /*
    * Sama seperti fungsi split(),
    * fungsi chunked() bisa kita gunakan
    * untuk memecah nilai String menjadi
    * beberapa bagian kecil dalam bentuk Array.
    * */
    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)

    /*
    * Selain itu, kita juga bisa menggunakannya untuk
    * memodifikasi setiap nilai yang sudah dipecah.
    * Contoh, hasil dari nilai yang sudah dipecah ingin kita buat menjadi huruf kecil,
    * maka kita bisa menggunakan fungsi chunked()
    * */

    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase()
    }

    println(chunkedTransform)

    // Sequence
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }

}