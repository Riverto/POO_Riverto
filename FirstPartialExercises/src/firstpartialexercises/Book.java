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
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name,Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
        public Book(String name,Author[] authors, double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    
}
