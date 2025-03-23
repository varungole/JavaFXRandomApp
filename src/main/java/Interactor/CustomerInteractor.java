package Interactor;

import Broker.CustomerBroker;
import Domain.Customer;
import Model.CustomerModel;

public class CustomerInteractor {
    private CustomerModel model;
    private final CustomerBroker customerBroker = new CustomerBroker();

    public CustomerInteractor(CustomerModel model) {
        this.model = model;
    }

    public void saveCustomer() {
        String customerName = model.getCustomerName();
        String accountNumber = model.getAccountName();
        int result = customerBroker.saveCustomer(createCustomerFromModel());
        System.out.println("Saving account " + accountNumber + " Name: " + customerName);
    }

    Customer createCustomerFromModel() {
        Customer customer = new Customer();
        customer.setAccountNumber(model.getAccountName());
        customer.setName(model.getCustomerName());
        return customer;
    }
}
