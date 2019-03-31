package AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerList = new ArrayList<>();
    private String name;

    public Branch(String name){
        this.name = name;
    }

    public void addNewCustomer(String customerName){
        Customer customer = new Customer(customerName);
        this.customerList.add(customer);
    }

    public void addNewCustomer(String customerName , double customerInitialTransactionAmount){
        Customer customer = new Customer(customerName , customerInitialTransactionAmount);
        this.customerList.add(customer);
    }

    public void addNewTransctionToExistingCustomer(String customerName, double newTransaction){
        this.customerList.forEach(customer -> {
            if(customer.getName() == customerName){
                customer.setTransactions(newTransaction);
            }
        });
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }
}
