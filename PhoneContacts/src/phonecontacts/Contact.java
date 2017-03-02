/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

/**
 *
 * @author Riverto
 */
public class Contact {
    private String name;
    private long phoneNumber;
    
    public Contact(String name, long phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getName() {
        return name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "Name:"+this.name+", PhoneNumber:"+this.phoneNumber;
    }
}
