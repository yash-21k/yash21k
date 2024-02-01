package com.wecp.progressive.service;


import com.wecp.progressive.entity.Customers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerServiceImplJpa implements CustomerService {

    private static List<Customers> customersList = new ArrayList<>();
    @Override
    public List<Customers> getAllCustomers() {
        return null;
    }

    @Override
    public Customers getCustomerById(int customerId) {
        return null;
    }

    @Override
    public int addCustomer(Customers customers) {
        return -1;
    }

    @Override
    public void updateCustomer(Customers customers) {

    }

    @Override
    public void deleteCustomer(int customerId) {

    }

    @Override
    public List<Customers> getAllCustomersSortedByName() {
        return null;
    }



    // The methods mentioned below have to be used for storing and manipulating data in an ArrayList.
    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return customersList;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        customersList.add(customers);
        return customersList;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        List<Customers> sortedCustomers = customersList;
        Collections.sort(sortedCustomers);
        return sortedCustomers;
    }

    @Override
    public void emptyArrayList() {
        customersList = new ArrayList<>();
    }
}
