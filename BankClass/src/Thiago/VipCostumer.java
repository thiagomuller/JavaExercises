package Thiago;

public class VipCostumer {

    private String name;
    private double creditLimit;
    private String email;



    public VipCostumer(){
        this("Default name" , 5000.00 , "default@email" );
    }

    public VipCostumer(String name, double creditLimit) {
        this(name ,  creditLimit , "unknown@email.com");
    }


    public VipCostumer(String name, double creditLimit, String email ) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
