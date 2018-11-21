package org.arhan

import org.arhan.model.Client

import org.arhan.model.ClientBuilder
import org.arhan.model.CompanyBuilder
import org.arhan.model.TwitterBuilder

@ClientDsl
fun createClient(c: ClientBuilderDsl.() -> Unit): Client {
    val builder = ClientBuilderDsl()
    c(builder)
    return builder.build()
}

//region Annotations
@DslMarker
annotation class ClientDsl

@ClientDsl
class CompanyBuilderDsl : CompanyBuilder()

@ClientDsl
class TwitterBuilderDsl : TwitterBuilder()
@ClientDsl
class ClientBuilderDsl : ClientBuilder()
//endregion

//region ClientBuilder extensions
@ClientDsl
fun ClientBuilder.company(t: CompanyBuilderDsl.() -> Unit) {
    company = CompanyBuilderDsl().apply(t).build()
}

@ClientDsl
fun ClientBuilder.twitter(t: TwitterBuilderDsl.() -> Unit) {
    twitter = TwitterBuilderDsl().apply(t).build()
}
//endregion

//region Client extensions
val Client.consoleString get() = "${twitter.handle} ${company.name}"

fun Client.toConsoleString() = "${twitter.handle} ${company.name}"
//endregion



