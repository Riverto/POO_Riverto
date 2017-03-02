/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static MobilePhone myPhone = new MobilePhone();
    public static void main(String[] args) {
        while(true){
            printMenu();
            int option = askOption();
            menu(option);
        }
    }
    public static void printMenu(){
        System.out.println("Menu: ");
        System.out.println("0. Quit");
        System.out.println("1. Add contact");
        System.out.println("2. Update contact");
        System.out.println("3. Delete contact");
        System.out.println("4. Query Contact");
        System.out.println("5. List all contacts");
        System.out.println("6. Print options");
    }
    public static int askOption(){
        Scanner key = new Scanner(System.in);
        int option=-1;
        System.out.print("Type a number from 0 to 6: ");
        while(option<0 || option>7){
            try {
                option = key.nextInt();
                return option;
            } catch (Exception InputMismatchException) {
                key.next();
            }
        }
        return option;
    }
    public static void menu(int option){
        String name;
        long num;
        switch(option){
            case 1:
                name = askString();
                num = askLong();
                if(myPhone.addContact(name,num)){
                    System.out.println("Contact added successfully.");
                } else System.out.println("Contact already exists.");
                break;
            case 2:
                name = askString();
                num = askLong();
                if(myPhone.updateContact(name,num)){
                    System.out.println("Contact updated successfully.");
                } else System.out.println("Contact doesn't already exist.");
                break;
            case 3:
                name = askString();
                if(myPhone.removeContact(name)){
                    System.out.println("Contact removed successfully.");
                } else System.out.println("Contact doesn't already exist.");
                break;
            case 4:
                name = askString();
                System.out.println(myPhone.findContact(new Contact(name,00)));
                break;
            case 5:
                myPhone.getContacts();
                break;
            case 6:
                printMenu();
                break;
            default:
                System.exit(0);
                break;
        }
    }
    public static String askString(){
        Scanner input = new Scanner(System.in);
        String temp = "";
        System.out.print("Type a name: ");
        while(temp.equals("")){
            try {
                    temp = input.next();
                } 
            catch (java.util.InputMismatchException e) {
                    System.out.println("Type a name: ");
            }
        }
        return temp;
    }
    public static long askLong(){
        Scanner input = new Scanner(System.in);
        long temp = 0;
        System.out.print("Type a number: ");
        while(temp<=0){
            try {
                    temp = input.nextLong();
                } 
            catch (Exception InputMismatchException) {
                    System.out.print("Type a number bigger than 0: ");
            }
        }
        input.nextLine();
        return temp;
    }
}
