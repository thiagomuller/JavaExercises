package BillBurgersChallenge;

public class BasicBurger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private String firstAddition;
    private double firstAdditionPrice;
    private String secondAddition;
    private double secondAdditionPrice;
    private String thirdAddition;
    private double thirdAdditionPrice;
    private String forthAddition;
    private double forthAdditionPrice;


    public BasicBurger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }


    public void addFirstAddition(String firstAddition , double firstAdditionPrice){
        this.firstAddition = firstAddition;
        this.firstAdditionPrice = firstAdditionPrice;
    }

    public void addSecondAddition(String secondAddition , double secondAdditionPrice){
        this.secondAddition = secondAddition;
        this.secondAdditionPrice = secondAdditionPrice;
    }

    public void addThirdAddiction(String thirdAddition , double thirdAdditionPrice){
        this.thirdAddition = thirdAddition;
        this.thirdAdditionPrice = thirdAdditionPrice;
    }

    public void addForthAddition(String forthAddition , double forthAdditionPrice){
        this.forthAddition = forthAddition;
        this.forthAdditionPrice  =forthAdditionPrice;
    }

    public double mountBurger(){
        double burgerPrice = this.price;

        if(this.firstAddition != null){
            burgerPrice += this.firstAdditionPrice;
        }
        if(this.secondAddition != null){
            burgerPrice += this.secondAdditionPrice;
        }
        if(thirdAddition != null){
            burgerPrice += this.thirdAdditionPrice;
        }
        if(this.forthAddition != null){
            burgerPrice += this.forthAdditionPrice;
        }

        System.out.println(this.name + " burger on a " + this.breadRollType + " roll with  " + this.meat + " meat price is " + burgerPrice);

        return burgerPrice;
    }

}
