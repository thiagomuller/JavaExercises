package AbstractClassExample;

public class Main {
    public static void main(String[] args){
        User user  = new User("Thiago" , 27 , 8 , 10 , 1990 , "Superinteligence" , "Guitar");

        //Methods declared within the abstract class
        user.printNameAndAge();
        user.printDayOfBirth();

        //Abstract methods, that were implemented by the class that was inheriting the abstract class, in this case, User class
        user.printMonthOfBirth();
        user.printYearOfBirth();

        //Methods declared within the User class
        user.printUserBook();
        user.printUserCurrentInstrument();
    }
}
