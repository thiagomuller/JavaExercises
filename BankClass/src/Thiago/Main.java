package Thiago;

public class Main {

    public static void main(String[] args){
        VipCostumer person1 = new VipCostumer();
        System.out.println(person1.getName());

        VipCostumer person2 = new VipCostumer("Bob", 200.00);
        System.out.println(person2.getName());

        VipCostumer person3 = new VipCostumer("Thiago" , 500.00 , "mullerthiago8@gmail.com");
        System.out.println(person3.getName());

    }
}
