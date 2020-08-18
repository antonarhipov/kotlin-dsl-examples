package org.arhan.kotlin

fun main() {
    val project = project {
        configuration {
            step {
                name = "step 1"
            }
        }
    }
    println(project.configurations[0].steps[0].command)
}

fun project(block: Project.() -> Unit): Project {
    return Project().apply(block)
}

fun Project.configuration(block: Configuration.() -> Unit): Configuration {
    val configuration = Configuration().apply(block)
    configurations.add(configuration)
    return configuration
}

fun Configuration.step(block: Step.() -> Unit): Step {
    val step = Step().apply(block)
    steps.add(step)
    return step
}

class Project {
    var configurations = mutableListOf<Configuration>()

    fun build(block: Configuration.() -> Unit) = Configuration().apply(block)
}

class Configuration {
    var steps = mutableListOf<Step>()
}

class Step {
    lateinit var name: String
    lateinit var command: String
}

