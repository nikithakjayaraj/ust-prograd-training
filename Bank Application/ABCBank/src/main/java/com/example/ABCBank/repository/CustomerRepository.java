package com.example.ABCBank.repository;

import com.example.ABCBank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CustomerRepository  extends JpaRepository<Customer,Integer> {


    Customer findByPassword(String password);

//    void update(Customer defaultCustomer);
}
