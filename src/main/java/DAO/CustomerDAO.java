package DAO;

import Database.CustomerDatabase;

import java.util.Map;

public class CustomerDAO {
    static CustomerDatabase customerDatabase = new CustomerDatabase();

    public int saveCustomer(Map<String,String> customerRecord) {
        return customerDatabase.saveCustomer(customerRecord);
    }
}
