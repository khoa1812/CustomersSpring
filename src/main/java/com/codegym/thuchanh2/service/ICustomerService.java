package com.codegym.thuchanh2.service;

import com.codegym.thuchanh2.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findByID(int id);
}
