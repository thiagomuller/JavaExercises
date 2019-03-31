package AbstractClassExample;

public class User extends AbstractHandsOn{
    private String userCurrentBook;
    private String userCurrentInstrument;
;

    public User(String userName, int userAge, int dayOfBirth, int monthOfBirth, int yearOfBirth, String userCurrentBook, String userCurrentInstrument) {
        super(userName, userAge, dayOfBirth, monthOfBirth, yearOfBirth);
        this.userCurrentBook = userCurrentBook;
        this.userCurrentInstrument = userCurrentInstrument;
    }

    public void printUserBook(){
        System.out.println("Current book for this user is: " + this.userCurrentBook);
    }

    public void printUserCurrentInstrument(){
        System.out.println("Current instrument for this user is: " + this.userCurrentInstrument);
    }

    public void printMonthOfBirth(){
        System.out.println("The month the user was born is: " + getMonthOfBirth());
    }

    public void printYearOfBirth(){
        System.out.println("The year the user was born is : " + getYearOfBirth());
    }
}
