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
public class bankAccount {
    private String name;
    private int accid;
    private double balance;
    private String username;
//------------------------------
    public bankAccount(){
        name="Roberto";
        accid=252015;
        balance=26;
        username="riverto";
    }
    public bankAccount(String name, int accid, double balance, String username){
        this.name=name;
        this.accid=accid;
        this.balance=balance;
        this.username=username;
    }
    // Name Getter and Setter
    public String obtainName(){
        return name;
    }
    public boolean setName(String name){
        if((name!=null)&&(!"".equals(name))){//Checks for a valid input
            this.name=name;// If input is valid
            return true;//a true value is returned
        }
        else return false;//if the input is invalid a false value is return
    }
    // accid Getter and Setter
    public int obtainAccid(){
        return accid;
    }
    public boolean setAccid(int accid){
        if(accid>=1){//Checks for a valid input
            this.accid=accid;// If input is valid
            return true;//a true value is returned
        } else return false;//if the input is invalid a false value is return
    }
    // balance Getter and Setter
    public double obtainBalance(){
        return balance;
    }
    public boolean setBalance(double balance){
        if(balance>=0){//Checks for a valid input
            this.balance=balance;// If input is valid
            return true;//a true value is returned
        } else return false;//if the input is invalid a false value is return
    }
    // username Getter and Setter
    public String obtainUsername(){
        return username;
    }
    public boolean setUsername(String username){
        if((name!=null)&&(!"".equals(username))){//Checks for a valid input
           this.username=username;// If input is valid
           return true;//a true value is returned
        } else return false;//if the input is invalid a false value is return
    }
    public void deposit(double amount){
        double currentBal=obtainBalance();
        if(setBalance(currentBal+amount)){
            System.out.print("Deposit was successful");
        } else System.out.print("Input was invalid.");
    }
    public void withdraw(double amount){
        double currentBal=obtainBalance();
        if(setBalance(currentBal-amount)){
            System.out.print("Withdrawal was successful");
        } else System.out.print("Input was invalid");
    }
}
