package com.codegym.thuchanh2.service;

import com.codegym.thuchanh2.model.Customer;
import com.codegym.thuchanh2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findByID(int id) {
        return repository.findByID(id);
    }
}
