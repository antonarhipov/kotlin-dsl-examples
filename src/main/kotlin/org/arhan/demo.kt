package org.arhan

@JvmOverloads
fun helloMessage(
    name: String,
    hello: String = "Hello"
) = "$hello, $name!"

