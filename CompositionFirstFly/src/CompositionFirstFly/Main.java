package CompositionFirstFly;

public class Main {
    public static void main(String[] args){
        PersonalComputer personalComputer = new PersonalComputer(new Motherboard("8gb" , "4") , "Dell" , new Processor("Intell"));

        System.out.println("Trying to access motherboard object inside personalcomputer object : " + personalComputer.motherboard.ramCapacity);
    }
}
