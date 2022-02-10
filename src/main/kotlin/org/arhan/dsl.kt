package org.arhan

import org.arhan.model.Client
import org.arhan.model.ClientBuilder
import org.arhan.model.CompanyBuilder
import org.arhan.model.TwitterBuilder

fun main() {
    //region dsl with extensions
//    val c1 = client {
//        firstName = "Anton"
//        lastName = "Arhipov"
//        twitter {
//            handle = "@antonarhipov"
//        }
//        company {
//            name = "JetBrains"
//            city = "Tallinn"
//        }
//        dob = 24 March 1981
    }
//    println("Created client is: $c1")
    //endregion¡

    //region dsl with apply()
//    val c2 = ClientBuilder().apply {
//        firstName = "Anton"
//        lastName = "Arhipov"
//
//        twitter = TwitterBuilder().apply {
//            handle = "@antonarhipov"
//        }.build()
//
//        company = CompanyBuilder().apply {
//            name = "JetBrains"
//            city = "Tallinn"
//        }.build()
//    }.build()
//    println("Created client is: $c2")
    //endregion
//}

//region dsl extensions
//fun ClientBuilder.company(block: CompanyBuilder.() -> Unit) {
//    company = CompanyBuilder().apply(block).build()
//}
//
//fun ClientBuilder.twitter(block: TwitterBuilder.() -> Unit) {
//    twitter = TwitterBuilder().apply(block).build()
//}


//fun client(c: ClientBuilder.() -> Unit): Client {
//    val builder = ClientBuilder()
//
//    c(builder)
//
//    return builder.build()
//}
//endregion
