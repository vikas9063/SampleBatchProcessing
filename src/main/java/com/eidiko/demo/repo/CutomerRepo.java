package com.eidiko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eidiko.demo.entitty.Customer;

@Repository
public interface CutomerRepo extends JpaRepository<Customer, Integer> {

}
