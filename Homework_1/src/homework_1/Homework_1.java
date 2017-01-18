/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

/**
 *
 * @author riverto
 */
public class Homework_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account myaccount = new account();
        account myotheraccount = new account(10.0,"252015");
        System.out.println("balance = $"+myaccount.getBalance());
        System.out.println("number = "+myaccount.getNumber());
        System.out.println("balance = $"+myotheraccount.getBalance());
        System.out.println("number = "+myotheraccount.getNumber());
        myotheraccount.deposit(50);
        System.out.println("balance = $"+myotheraccount.getBalance());
        myaccount.withdrawal(15);
        myotheraccount.withdrawal(40);
        System.out.println("My account balance = $"+myaccount.getBalance());
        System.out.println("My other account balance = $"+myotheraccount.getBalance());   
    }    
}
