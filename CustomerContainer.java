package byggemarket.model;

import java.util.ArrayList;

public class CustomerContainer {
    private static CustomerContainer instance;
    private ArrayList<Customer> customers;

    //create arraylist
    private CustomerContainer() {
        customers = new ArrayList<>();
    }

    //create customer container
    public static CustomerContainer getInstance() {
        if (instance == null) {
            instance = new CustomerContainer();
        }
        return instance;
    }
   
    //find customer
    public Customer findCustomer(String name, int phone) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(name) && c.getPhone() == phone) {
                return c;
            }
        }
        return null;
    }
    
    //save customer
    public void saveCustomer(Customer customer){
        customers.add(customer);
    
    }
}
