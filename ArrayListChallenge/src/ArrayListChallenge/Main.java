package ArrayListChallenge;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        MobilePhone mobilePhone = new MobilePhone();
        boolean finishExecution = false;
        while(!finishExecution){
            System.out.println("This is the mobile phone, you can do some of the following actions:\n");
            System.out.printf("Store : For storing new contact\n\n");
            System.out.println("Modify : For modifying an existent contact\n");
            System.out.println("Remove : For removing an existent contact\n");
            System.out.println("Query: To query for an existent contact\n");
            System.out.println("Please type the option you would like to use, or type exit to leave:\n");
            String response = scanner.next().toLowerCase();

            String name = "";
            String phoneNumber = "";

            switch (response){
                case "store":
                    System.out.println("Please enter the name and phone number to be stored:\n");
                    System.out.println("Name : ");
                    name = scanner.next().trim();
                    System.out.println("Phone Number: ");
                    phoneNumber = scanner.next().trim();
                    mobilePhone.store(name , phoneNumber);
                    break;

                case "modify":
                    System.out.println("Please enter the name of the contact you want to modify:\n");
                    name = scanner.next().trim();
                    mobilePhone.modify(name);
                    break;

                case "remove":
                    System.out.println("Please enter the name of the contact you want to remove:\n");
                    name = scanner.next().trim();
                    mobilePhone.remove(name);
                    break;

                case "query":
                    System.out.println("Please enter the name of the contact you want to consult\n");
                    name = scanner.next().trim();
                    mobilePhone.query(name);
                    break;

                case "exit":
                    finishExecution = true;
                    System.out.println("Thanks for using!");
                    break;
            }
        }


    }
}
