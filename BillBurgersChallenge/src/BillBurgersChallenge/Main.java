package BillBurgersChallenge;

public class Main {

    public static void main(String[] args) {
        BasicBurger basicBurger = setBasicBurgerObject();
        HealthyBurger healthyBurger = setHealthyBurgerObject();
        printValueObjects(basicBurger, healthyBurger);
    }

    private static BasicBurger setBasicBurgerObject() {
        BasicBurger basicBurger = new BasicBurger("Basic", "White", "Sausage", 3.95);
        basicBurger.addFirstAddition("Cottage", 2.95);
        basicBurger.addSecondAddition("Bacon", 2.10);
        return basicBurger;
    }

    private static HealthyBurger setHealthyBurgerObject() {
        HealthyBurger healthyBurger = new HealthyBurger("ham", 3.10);
        healthyBurger.addFirstAddition("Cottage", 2.95);
        healthyBurger.addSecondAddition("Bacon", 2.10);
        return healthyBurger;
    }

    private static void printValueObjects(BasicBurger basicBurger, HealthyBurger healthyBurger) {
        System.out.println("Basic burger total price " + basicBurger.mountBurger());
        System.out.println("Total healthy burger price is " + healthyBurger.mountBurger());
    }

}
