package byggemarket.controller;

import byggemarket.model.Customer;
import byggemarket.model.CustomerContainer;

public class CustomerController {
    private CustomerContainer customerContainer;
    private Customer customer;

    public CustomerController() {
        this.customerContainer = CustomerContainer.getInstance();
    }

    //find customer
    public Customer findCustomer(String name, int phone) {
        customer = customerContainer.findCustomer(name, phone);
        return customer;
    }

    // save customer
    public Customer saveCustomer(String name, int phone) {
        Customer newCustomer = new Customer(name, phone);
        customerContainer.saveCustomer(newCustomer);
        return newCustomer;
    }

}
