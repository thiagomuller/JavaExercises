package ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private Contact contact;
    private ArrayList<Contact> contactList;
    public static Scanner scanner = new Scanner(System.in);

    public MobilePhone(){
        this.contactList = new ArrayList<Contact>();
    }

    public MobilePhone(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public void store(String contactName , String phoneNumber){
        Contact contact = new Contact(contactName , phoneNumber);
        contactList.add(contact);
    }

    public void modify(String name){
        for(Contact cont : this.contactList){
            if(cont.getName() == name){
                System.out.println("Please enter the new name for the contact: \n");
                cont.setName(scanner.next());
                System.out.println("Please enter the new phone number for the contact: \n");
                cont.setPhoneNumber(scanner.next());
                System.out.println("Contact updated!");
            }
        }
    }

    public void remove(String name){
        ArrayList<Contact> contactToRemove = new ArrayList<Contact>();
        for(Contact cont : this.contactList){
            if(cont.getName().equals(name)){
                contactToRemove.add(cont);
            }
        }
        this.contactList.removeAll(contactToRemove);
    }

    public void query(String name){
        for(Contact cont : this.contactList){
            if(cont.getName().equals(name)) {
                System.out.println("Here's information about the contact you're quierying:\n");
                System.out.println("Name: " + cont.getName() + ", Phone Number: " + cont.getPhoneNumber() + "\n");
            }
        }
    }

}
