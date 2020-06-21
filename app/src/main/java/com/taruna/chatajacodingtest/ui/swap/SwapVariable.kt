package com.taruna.chatajacodingtest.ui.swap

fun main() {
    var a = 3
    var b = 6

    println("The value of a before swap is $a")
    println("The value of b before swap is $b")

    // Swapping of two numbers
    a = a.xor(b)
    b = a.xor(b)
    a = a.xor(b)

    println("The value of a after swap is $a")
    println("The value of b after swap is $b")
}