package com.java.junit.repository;

import com.java.junit.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;
     public CustomerRepository(){
         this.customers = new ArrayList<>();
     }
     public Customer save(Customer customer){
         this.customers.add(customer);
         return customer;

     }
}
