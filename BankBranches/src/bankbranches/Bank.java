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
    public boolean addBranch(String name){
        int i=findbranch(name);
        if(i==-1){
            this.branches.add(new Branch(name));
            System.out.println("Success!");//sout for debugging
            return true;
        }
        System.out.println("Branch already exists!");//sout for debugging
        return false;
    }
    public boolean addCustomer(String bName, String cName, double amount){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");//sout for debugging
            return false;
        }
        if(this.branches.get(i).addCustomer(cName, amount)){
        System.out.println("Customer added to "+bName+"!");//sout for debugging
        return true;
        }
        return false;
    }
    public boolean addTransaction(String bName, String cName, double amount){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");//sout for debugging
            return false;
        }
        if(this.branches.get(i).addTransaction(cName, amount)){
        System.out.println("Transaction added to "+cName+" at "+bName+" branch");//sout for debugging
        return true;
        }
        return false;
    }
    public boolean getTransactions(String bName, String cName){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println(cName+" does not exist!");//sout for debugging
            return false;
        }
        if(this.branches.get(i).findCustomer(cName)!=-1){
            System.out.println("Customer "+cName+" transactions at "+bName+" branch are:");
            for(double temp : this.branches.get(i).getTransactions(cName)){//probably should move this elsewhere
                System.out.println(temp);
            }
            return true;
        }
        System.out.println(cName+" does not exist in "+bName);//sout for debugging
        return false;
    }
    public void getCustomers(String bName){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");//sout for debugging
        }
        System.out.println("Customers at branch "+bName);//sout for debugging
        for(Customer temp : this.branches.get(i).getCustomers()){
            System.out.println(temp.getName());
        }
    }
        public boolean getCustomersWithTransactions(String bName){
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");//sout for debugging
            return false;
        }
        for(Customer temp : this.branches.get(i).getCustomers()){
            getTransactions(bName, temp.getName());
        }
        return true;
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
