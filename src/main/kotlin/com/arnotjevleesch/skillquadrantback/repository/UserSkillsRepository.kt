package com.arnotjevleesch.skillquadrantback.repository

import com.arnotjevleesch.skillquadrantback.pojo.UserSkills

import org.springframework.data.mongodb.repository.MongoRepository


interface UserSkillsRepository : MongoRepository<UserSkills, String> {

    fun findByUser(user: String): UserSkills

}

