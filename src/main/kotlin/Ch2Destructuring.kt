package com.nudriin

fun main(){
    val dataUser = DataUser("nrohmen", 17) // DataUser yang ada di DataClasse

    // Dengan fungsi componentN() yang ada pada data class,
    // kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya
    val name = dataUser.component1() // destructure property 1 = name
    val age = dataUser.component2() // destructure property 2 = age
    val (name2, age2) = dataUser // destructure cara kedua


    println("My name is $name, I am $age years old")
    println("My name is $name2, I am $age2 years old")
}