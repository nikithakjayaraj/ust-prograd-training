package com.example.ABCBank.service;

import com.example.ABCBank.entity.Customer;
import com.example.ABCBank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public Customer printCustomerDetails(String password){
        return customerRepository.findByPassword(password);
    }

    public void deleteCustomer(Integer accountID) {
        customerRepository.deleteById(accountID);
    }

//    public boolean existByEmailID(String emailID) {
//        customerRepository.findByEmail(emailID);
//    }


//    public void updateCustomer(Customer defaultCustomer) {
//        customerRepository.update(defaultCustomer);
//    }
}
