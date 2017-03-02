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
    }
    public void addCustomer(String bName, String cName, double amount){//
        int i = findbranch(bName);
        if(i==-1){
            System.out.println("Branch does not exist!");
            return;
        }
        this.branches.get(i).addCustomer(cName, amount);
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
