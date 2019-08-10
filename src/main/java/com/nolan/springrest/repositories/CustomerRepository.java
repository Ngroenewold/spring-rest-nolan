package com.nolan.springrest.repositories;

import com.nolan.springrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
 // JPA repository for working with JPA entities
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
