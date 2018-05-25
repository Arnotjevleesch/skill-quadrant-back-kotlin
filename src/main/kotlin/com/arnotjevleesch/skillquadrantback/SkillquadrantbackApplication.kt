package com.arnotjevleesch.skillquadrantback

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.arnotjevleesch.skillquadrantback.repository.UserSkillsRepository
import org.springframework.beans.factory.annotation.Autowired
import com.arnotjevleesch.skillquadrantback.repository.CustomerRepository



@SpringBootApplication
class SkillquadrantbackApplication : CommandLineRunner {

    @Autowired
    private val customerRepository: CustomerRepository? = null

    @Autowired
    lateinit var userSkillsRepository: UserSkillsRepository

    override fun run(vararg args: String?) {
        println("=====================")
        val text: String? = null
        val length = text?.length
        println(length)
        println("=====================")
        val length1 = text?.length ?: "toto"
        println(length1)
        println("=====================")

        val listWithNulls: List<String?> = listOf("A", null, "C")
        for (item in listWithNulls) {
            //item?.let { println(it) } // prints A and ignores null
            item?.map { println(it) } // prints A and ignores null
        }

    }
}

fun main(args: Array<String>) {
    runApplication<SkillquadrantbackApplication>(*args)
}