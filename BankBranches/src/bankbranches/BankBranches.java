/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

/**
 *
 * @author Riverto
 */
public class BankBranches {

    public static Bank testbank = new Bank();
    public static void main(String[] args) {
        testbank.addBranch("testbranch");
        //testbank.addCustomer("testbranch","test", 1000);
        testbank.addTransaction("testbranch", "test", 1500);
        testbank.getCustomers("testbranch");
        testbank.getTransactions("testbranch", "test");
        testbank.addTransaction("testbranch", "test", 2300);
        testbank.addTransaction("testbranch", "test", 3400);
        testbank.getTransactions("testbranch", "test");
        testbank.addCustomer("testbranch", "test2", 5000);
        testbank.getCustomersWithTransactions("testbranch");
        testbank.getCustomers("testbranch");
    }
    
}
