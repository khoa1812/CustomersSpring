package com.codegym.thuchanh2.repository;

import com.codegym.thuchanh2.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList;

    static  {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nguyen Khac Nhat","nhat@codegym.vn","Hà Nội"));
        customerList.add(new Customer(2, "Dang Huy Hoa","hoa.dang@codegym.vn","Đà Nẵng"));
        customerList.add(new Customer(3, "Le Thi Chau","chau.le@codegym.vn","Hà Nội"));
        customerList.add(new Customer(4, "Nguyen Thuy Duong","duong.nguyen@codegym.vn","Sài Gòn"));
        customerList.add(new Customer(5, "Code Gym","codegym@codegym.vn","Việt Nam"));
    }

    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findByID(int id) {
        for (Customer customer:customerList) {
            if (customer.getId() == id)
                return customer;
        }return null;
    }


}
