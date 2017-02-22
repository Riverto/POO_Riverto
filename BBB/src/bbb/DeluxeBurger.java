/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;

/**
 *
 * @author Riverto
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String bread, String meat, double price, Ingredient addition1, Ingredient addition2) {
        super(bread, meat, price);
        type="DeluxeBurger";
        limAdditions=2;
        this.setAdditions(addition1);
        this.setAdditions(addition2);
    }
    public DeluxeBurger(String bread, String meat, double price, String name1, double price1, String name2, double price2) {
        super(bread, meat, price);
        type="DeluxeBurger";
        limAdditions=2;
        this.setAdditions(name1,price1);
        this.setAdditions(name2,price2);
    }
}