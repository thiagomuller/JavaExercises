package BillBurgersChallenge;

public class HealthyBurger extends BasicBurger{
    private String firstHealthyExtra;
    private double firstHealthyExtraPrice;

    private String secondHealthyExtra;
    private double secondHealthyExtraPrice;

    HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
        this.firstHealthyExtra = firstHealthyExtra;
    }

    public void addFirstHealthyAddition(String name , double price, String firstHealthyExtra){
        firstHealthyExtra = this.firstHealthyExtra;
        this.firstHealthyExtra = name;
        this.firstHealthyExtraPrice = price;
    }

    public void addSecondHealthyAddition(String name , double price){
        this.secondHealthyExtra = name;
        this.secondHealthyExtraPrice = price;
    }

    @Override
    public double mountBurger() {
        double burgerPrice = super.mountBurger();


        if(this.firstHealthyExtra != null){
            burgerPrice += this.firstHealthyExtraPrice;
            System.out.println("Added " + this.firstHealthyExtra + " for an extra " + this.firstHealthyExtraPrice);
        }
        if(this.secondHealthyExtra != null){
            burgerPrice += this.secondHealthyExtraPrice;
            System.out.println("Added " + this.secondHealthyExtra + " for an extra " + this.secondHealthyExtraPrice);
        }

        return burgerPrice;
    }
}
