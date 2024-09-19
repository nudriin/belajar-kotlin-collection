package com.nudriin

fun main() {

    // Membuat Map
    val person = mapOf(
        "Name" to "Nurdin",
        "Age" to 20,
        "IsMale" to true
    )

    println(person)
    println(person["Name"])
    println(person["Age"])
    println(person["IsMale"])

//    Bisa juga
    println(person.getValue("Name"))
    println(person.getValue("Age"))
    println(person.getValue("IsMale"))

    // Menampilkan keys properties nya
    println(person.keys)

    // Menampilkan values properties nya
    println(person.values)

    val mutablePerson = person.toMutableMap() // mengubah map menjadi mutable
    mutablePerson.put("Address", "Pangeran Samudera") // menambahkan data pada mapnya
    println(mutablePerson)

}