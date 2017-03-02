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
public class Bank {
    private ArrayList<Branch> branches;
    
    public Bank(){
        this.branches = new ArrayList();
    }
    public void addBranch(String name){
        this.branches.add(new Branch(name));
        System.out.println("Success!");
    }
    public void addCustomer(String bName, String cName, double amount){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");
            return;
        }
        this.branches.get(i).addCustomer(cName, amount);
        System.out.println("Customer added to "+bName+"!");
    }
    public void addTransaction(String bName, String cName, double amount){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");
            return;
        }
        this.branches.get(i).addTransaction(cName, amount);
        System.out.println("Transaction added to "+cName+" at "+bName+" branch");
    }
    public void getTransactions(String bName, String cName){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");
        }
        System.out.println("Customer "+cName+" transactions at "+bName+" branch are:");
        for(double temp : this.branches.get(i).getTransactions(cName)){
            System.out.println(temp);
        }
    }
    public void getCustomers(String bName){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");
        }
        for(Customer temp : this.branches.get(i).getCustomers()){
            System.out.println(temp.getName());
        }
    }
    public int findbranch(String name){
        for(Branch temp : this.branches){
            if(temp.getName().equalsIgnoreCase(name)){
                return branches.indexOf(temp);
            }
        }
        return -1;
    }
}
