/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;

import java.util.*;

/**
 *
 * @author Riverto
 */
public class Hamburger {
    private String bread;
    private String meat;
    private ArrayList<Ingredient> additions = new ArrayList();
    private double price;
    protected int limAdditions;
    protected String type;

    public Hamburger(String bread, String meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.limAdditions = 4;
        this.type="BasicBurger";
    }
    public boolean setAdditions(Ingredient addition) {
        if(additions.size()<limAdditions){
            additions.add(addition);
            return true;
        } else {
            System.out.println("Limit Reached!");
            return false;
        }
    }
    public boolean setAdditions(String name, double price){
        return setAdditions(new Ingredient(name, price));
    }
    public String getBread() {
        return bread;
    }
    public String getMeat() {
        return meat;
    }
    public double getPrice() {
        return price;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void setBread(String bread) {
        this.bread = bread;
    }
    public void getTotal(){
        double total;
        System.out.println("This is a "+this.type);
        System.out.println("The price of this burger is "+this.price);
        total = this.price;
        if(!additions.isEmpty()){
            System.out.println("You also ordered this additions");
            for(Ingredient temp : additions){
                total += temp.getPrice();
                System.out.println(temp.toString());
            }
        }
        System.out.println("Your total is $"+total);
    }
}
