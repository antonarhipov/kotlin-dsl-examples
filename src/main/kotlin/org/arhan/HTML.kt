package org.arhan

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import kotlinx.html.stream.createHTML

fun main(args: Array<String>) {
    System.out.appendHTML().
        html {
            body {
                div {
                    a("http://kotlinlang.org") {
                        target = ATarget.blank
                        +"Main site"
                    }
                }
            }
        }
}



