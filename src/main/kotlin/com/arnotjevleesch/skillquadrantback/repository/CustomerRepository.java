package com.arnotjevleesch.skillquadrantback.repository;

import com.arnotjevleesch.skillquadrantback.pojo.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.vavr.collection.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}

