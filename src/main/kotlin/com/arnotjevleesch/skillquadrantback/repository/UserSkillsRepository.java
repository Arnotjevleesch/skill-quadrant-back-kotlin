package com.arnotjevleesch.skillquadrantback.repository;

import com.arnotjevleesch.skillquadrantback.pojo.UserSkills;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserSkillsRepository extends MongoRepository<UserSkills, String> {

    public UserSkills findByUser(String user);

}

