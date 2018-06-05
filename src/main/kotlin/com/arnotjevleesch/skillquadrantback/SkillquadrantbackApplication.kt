package com.arnotjevleesch.skillquadrantback

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.lang.management.ManagementFactory


@SpringBootApplication
class SkillquadrantbackApplication : CommandLineRunner {



    override fun run(vararg args: String?) {
        println("========Kotlin sandbox=============")
        val text: String? = null
        val length = text?.length
        println(length)
        println("===================================")
        val length1 = text?.length ?: "toto"
        println(length1)
        println("===================================")

        val listWithNulls: List<String?> = listOf("A", null, "C")
        for (item in listWithNulls) {
            //item?.let { println(it) } // prints A and ignores null
            item?.map { println(it) } // prints A and ignores null
        }

        println("==============JVM==================")
        val runtimeMXBean = ManagementFactory.getRuntimeMXBean()
        val jvmArgs = runtimeMXBean.inputArguments
        for (arg in jvmArgs) {
            println(arg)
        }
    }

}

fun main(args: Array<String>) {
    runApplication<SkillquadrantbackApplication>(*args)
}