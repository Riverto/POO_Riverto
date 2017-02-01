/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Riverto
 */
public class Employee {
    private int id, salary;
    private String firstName,lastName;
    
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName=firstName;
    }
    public String getLastName(){
        return this.lastName=lastName;
    }
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        return this.salary+=salary*percent;
    }
    @Override
    public String toString(){
        return "Employee[id="+this.id+",name="+getName()+",salary="+this.salary+"]";
    }
}
