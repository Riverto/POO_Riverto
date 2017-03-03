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
public class Branch {
    private ArrayList<Customer> customers;
    private String name;
    public Branch(String name){
        this.name= name;
        this.customers = new ArrayList();
    }
    public boolean addCustomer(String name, double amount){
        int i = findCustomer(name);
        if(i==-1){
            System.out.println("Customer already exists!");
            return false;
        }
        this.customers.add(new Customer(name,amount));
        return true;
    }
    public String getName() {
        return name;
    }
    public boolean addTransaction(String name, double amount){
        int i = findCustomer(name);
        if(i==-1){
            System.out.println("Customer does not exist!");
            return false;
        }
        this.customers.get(i).addTransaction(amount);
        return true;
    }
    public ArrayList<Double> getTransactions(String name) {
        int i = findCustomer(name);
        if(i==-1){
            System.out.println("Customer does not exist!");
            return null;
        }
        return this.customers.get(i).getTransactions();
    }

    public ArrayList<Customer> getCustomers() {
        if(this.customers.isEmpty()) System.out.println("There are no customers in this branch yet");
        return customers;
    }
    public int findCustomer(String name){
        for(Customer temp : this.customers){
            if(temp.getName().equalsIgnoreCase(name)){
                return customers.indexOf(temp);
            }
        }
        return -1;
    }
}
