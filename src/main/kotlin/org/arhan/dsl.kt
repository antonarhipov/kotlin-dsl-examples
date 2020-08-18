package org.arhan

import org.arhan.model.Client
import org.arhan.model.ClientBuilder
import org.arhan.model.CompanyBuilder
import org.arhan.model.TwitterBuilder

fun main() {
    val client = createClient {
        firstName = "Anton"
        lastName = "Arhipov"
        twitter { handle = "@antonarhipov" }
        company { name = "JetBrains"; city = "Tallinn" }
        dob = 24 March 1981
    }
    println("Created client is: $client")
}


fun ClientBuilder.company(block: CompanyBuilder.() -> Unit) {
    company = CompanyBuilder().apply(block).build()
}

fun ClientBuilder.twitter(block: TwitterBuilder.() -> Unit) {
    twitter = TwitterBuilder().apply(block).build()
}


fun createClient(c: ClientBuilder.() -> Unit): Client {
    val builder = ClientBuilder()

    c(builder)

    return builder.build()
}
