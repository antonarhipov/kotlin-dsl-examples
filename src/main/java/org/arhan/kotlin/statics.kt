package org.arhan.kotlin

import org.arhan.events.Event

class StaticFunctions {

}

data class Person(val name: String, val age: Int)

fun main() {
    val (name, age) = Person("Blah", 10)

    println(age)
    println(name)

    Event::class.java
    Event("Asd").javaClass
}

