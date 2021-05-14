package com.myapp.ecommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
