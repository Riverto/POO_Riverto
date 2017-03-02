/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author Riverto
 */
public class Customer {
    private ArrayList<Double> transactions = new ArrayList();
    private String name;
    
    public Customer(String name, double initialAmount){
        this.name=name;
        this.transactions.add(initialAmount);
    }
    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    public String getName() {
        return name;
    }
    
}
