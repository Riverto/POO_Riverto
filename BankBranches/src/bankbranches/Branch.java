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
    public void addCustomer(String name, double amount){
        this.customers.add(new Customer(name,amount));
    }
    public String getName() {
        return name;
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
