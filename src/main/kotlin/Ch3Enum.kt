package com.nudriin

// Membuat enum class
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    //    YELLOW(22)
}

enum class Role {
    USER, ADMIN, SUPER_ADMIN
}

enum class TextSize(val value: Int) {
    SM(1){ // anonymous class
        override fun printValue() {
            println("value of SM is $value px")
        }
    },
    MD(2){ // anonymous class
        override fun printValue() {
            println("value of MD is $value px")
        }
    },
    LG(3){ // anonymous class
        override fun printValue() {
            println("value of LG is $value px")
        }
    };

//     Membuat abstract function untuk data setiap enum
    abstract fun printValue()
}

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val user = Role.USER
    val admin = Role.ADMIN
    val superAdmin = Role.SUPER_ADMIN

    val sm = TextSize.SM
    val md = TextSize.MD
    val lg = TextSize.LG

    println(colorRed.value)
    println(colorBlue.value)
    println(colorGreen.value)

    println()
    println(user)
    println(admin)
    println(superAdmin)

    println()
    sm.printValue()
    md.printValue()
    lg.printValue()

    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }

    // mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum
    // gunakan fungsi enumValues() dan fungsi enumValueOf()
    val colorValues: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")
    // mendapatkan posisi tiap objek menggunakan properti ordinal
    println("Color $color is in position ${color.ordinal}")

}
