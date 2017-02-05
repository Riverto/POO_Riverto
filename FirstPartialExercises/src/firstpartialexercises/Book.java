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
    public String getName() {
        return name;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString(){
        return "Book[name="+this.getName()+",authors="+getAuthorNames(this.authors)+"price="+this.getPrice()+",qty="+this.getQty()+"]";
    }
    public String getAuthorNames(Author[] authors){
        String s="";
        for(int i=0;i<authors.length;i++){
            s +=authors[i].toString()+",";
        }
        return s;
    }
}
