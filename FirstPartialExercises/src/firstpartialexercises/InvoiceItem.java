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
public class InvoiceItem {
    private String id,desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id,String desc, int qty, double unitPrice){
        this.id=id;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public String getID(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public double getUnitPrice(){
        return this.unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    
}
