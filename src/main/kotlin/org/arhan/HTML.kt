package org.arhan

import kotlinx.html.*
import kotlinx.html.stream.appendHTML

fun main() {
    System.out.appendHTML().html {
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



