package com.codegym.thuchanh2.controller;


import com.codegym.thuchanh2.model.Customer;
import com.codegym.thuchanh2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping (value = "/customers", method = RequestMethod.GET)
    public ModelAndView showInfo() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/info")
    public ModelAndView showInfo(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerService.findByID(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
}
