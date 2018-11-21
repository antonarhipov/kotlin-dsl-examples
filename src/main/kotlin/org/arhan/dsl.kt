package org.arhan

fun main(args: Array<String>) {

    val client = createClient {
        firstName = "Anton"
        lastName = "Arhipov"

        twitter {
            handle = "@antonarhipov"
        }

        company {
            name = "JetBrains"
            city = "Tallinn"

        }

    }

    println("Created client is: ${client.consoleString}")

}

