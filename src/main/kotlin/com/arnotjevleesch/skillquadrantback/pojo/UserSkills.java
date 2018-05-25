package com.arnotjevleesch.skillquadrantback.pojo;

import org.springframework.data.annotation.Id;

import io.vavr.collection.List;

public class UserSkills {

    @Id
    public String id;

    public String user;
    public List<Skill> skills;

    public UserSkills(String user, List<Skill> skills) {
        this.user = user;
        this.skills = skills;
    }

        
}

