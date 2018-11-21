package org.arhan

@JvmOverloads
fun helloMessage(
    name: String,
    hello: String = "Hello"
) = "$hello, $name!"


fun main() {
    val arrayOf = arrayOf(1, "asd", Object())
    println(arrayOf.javaClass)
    println(arrayOf::class)
    println(arrayOf::class.java)
}
