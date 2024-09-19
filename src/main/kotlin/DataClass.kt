package com.nudriin

class User(val name : String, val age : Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy() // mengcopy dataUser ke dataUser4
    val dataUser5 = dataUser.copy(age = 18) // mengcopy dataUser ke dataUser5 namun age diubah

    println(user)
    println(dataUser)
    println(dataUser4)
    println(dataUser5)

    println(user.equals(user2)) // membandingkan object
    println(user.equals(user3)) // membandingkan object
    println(dataUser.equals(dataUser2)) // membandingkan object
    println(dataUser.equals(dataUser3)) // membandingkan object
}