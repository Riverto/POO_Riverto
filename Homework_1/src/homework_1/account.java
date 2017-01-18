/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

/**
 *
 * @author Riverto
 */
public class account {
    private double balance;
    private String number;
    
    public account (double balance,String number){
        this.balance=balance;
        this.number=number;
    }
    public account(){
        this(0.00, "Sin Numero");
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double amount){
        this.balance=amount;
    }
    public String getNumber(){
        return this.number;
    }
    public void setNumber(String number){
        this.number=number;
    }
    public void deposit(double amount){
        this.balance+=amount;// balance=balance+amount
        System.out.println("Deposit was successful.");
    }
    public boolean withdrawal(double amount){
        //this.balance-=amount;// balance=balance-amount
        if(this.balance>=amount){
            this.balance-=amount;
            return true;
        } else {
            System.err.println("Insufficient funds.");
            return false;
        }
    }
}
