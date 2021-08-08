package com.example.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    //extends the default CRUD: Create, Read, Update, Delete repo
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
