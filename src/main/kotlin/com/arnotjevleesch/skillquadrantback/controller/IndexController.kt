package com.arnotjevleesch.skillquadrantback.controller

import com.arnotjevleesch.skillquadrantback.pojo.Skill
import com.arnotjevleesch.skillquadrantback.pojo.SkillItem
import com.arnotjevleesch.skillquadrantback.pojo.UserSkills
import com.arnotjevleesch.skillquadrantback.repository.UserSkillsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @Autowired
    lateinit var userSkillsRepository: UserSkillsRepository

    @RequestMapping("/")
    fun index() : String {
        return "Greetings from Spring Boot!"
    }

    @RequestMapping("/mongo")
    fun mongo() : String {

        println("=========Repo manip================")

        if (userSkillsRepository.findAll().size == 10) {
            userSkillsRepository.deleteAll()
        }

        userSkillsRepository.save(
                UserSkills(
                        "Arnotjevleesch",
                        listOf(
                                Skill(
                                        "bdd",
                                        "BDD",
                                        "#80f79a",
                                        listOf(SkillItem(50, 32, 10, "MySQL"))
                                )
                        )
                )
        )


        // fetch all customers
        return userSkillsRepository.findAll().joinToString()
    }
}