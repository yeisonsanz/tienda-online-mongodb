package com.example.tiendaonlinemongodb.rest;

import com.example.tiendaonlinemongodb.model.Customer;
import com.example.tiendaonlinemongodb.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerResourceImpl  implements CustomerResource {

    private final CustomerService customerService;

    public CustomerResourceImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @Override
    public Customer findById(String id) {
        return customerService.findById(new org.bson.types.ObjectId(id));
    }


    @Override
    public Customer create(Customer customer) {
        return customerService.save(customer);
    }

    @Override
    public Customer update(String id, Customer customer) {
        return customerService.update(id, customer);
    }

    @Override
    public void delete(String id) {
        customerService.delete(id);
    }
}
