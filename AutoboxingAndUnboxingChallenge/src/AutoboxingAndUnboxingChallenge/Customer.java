package AutoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name){
        this.name = name;
        this.transactions.add(0.0);
    }

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions.add(transactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(double transaction) {
        this.transactions.add(transaction);
    }
}
