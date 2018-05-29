package com.arnotjevleesch.skillquadrantback.pojo

import org.springframework.data.annotation.Id

data class UserSkills(var user: String, var skills: List<Skill>) {

    @Id
    var id: String? = null


}

