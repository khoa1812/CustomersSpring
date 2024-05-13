package com.codegym.thuchanh2.repository;

import com.codegym.thuchanh2.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    Customer findByID(int id);
}