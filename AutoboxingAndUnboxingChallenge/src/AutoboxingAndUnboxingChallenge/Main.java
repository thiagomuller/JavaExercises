package AutoboxingAndUnboxingChallenge;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("Banco central");
        bank.addNewBranch("Santander");
        bank.addCustomerToBranch("Santander" , "Thiago", 100.0);
        bank.addCustomerToBranch("Santander" , "Paty" , 200.0);
        bank.addTransactionForExistingCustomer("Santander" , "Thiago" , 1500.0);
        bank.addTransactionForExistingCustomer("Santander" , "Paty" , 2000.0);
        bank.showCustomersListAndTransactions("Santander");
        bank.addNewBranch("Itaú");
        bank.addCustomerToBranch("Itaú" , "Nih" , 100.0);
        bank.addCustomerToBranch("Itaú" , "Murilo" , 500.0);
        bank.showCustomersListAndTransactions("Itaú");
    }
}
