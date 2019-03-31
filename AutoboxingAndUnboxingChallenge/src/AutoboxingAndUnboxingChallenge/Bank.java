package AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }

    public void addNewBranch(String name){
        Branch branch = new Branch(name);
        this.branches.add(branch);
    }

    public void addCustomerToBranch(String branchName , String customerName){
        branches.forEach(item -> {
           if(item.getName() == branchName){
               item.addNewCustomer(customerName);
           }
        });
    }

    public void addCustomerToBranch(String branchName , String customerName, double transaction){
        branches.forEach(item -> {
            if(item.getName() == branchName){
                item.addNewCustomer(customerName , transaction);
            }
        });
    }

    public void addTransactionForExistingCustomer(String branchName , String customerName , double transaction){
        branches.forEach(item -> {
           if(item.getName() == branchName){
               item.addNewTransctionToExistingCustomer(customerName , transaction);
           }
        });
    }

    public void showCustomersListAndTransactions(String branchName){
        branches.forEach(item -> {
            if(item.getName() == branchName){
                item.getCustomerList().forEach(customerInThisBranch -> {
                    System.out.println("Customer : " + customerInThisBranch.getName() + " transactions : \n");
                    customerInThisBranch.getTransactions().forEach(transaction -> {
                        System.out.println(transaction + "\n");
                    });
                });
            }
        });
    }

}
