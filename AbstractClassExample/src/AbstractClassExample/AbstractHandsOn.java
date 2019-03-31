package AbstractClassExample;

public abstract class AbstractHandsOn {
    private String userName;
    private int userAge;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public AbstractHandsOn(String userName, int userAge, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.userName = userName;
        this.userAge = userAge;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void printNameAndAge(){
        System.out.println("The user name is: " + this.userName + ", and its age is: " + this.userAge);
    }

    public void printDayOfBirth(){
        System.out.println("The day this user was born is: " + this.dayOfBirth);
    }

    public abstract void printMonthOfBirth();

    public abstract void printYearOfBirth();
}
