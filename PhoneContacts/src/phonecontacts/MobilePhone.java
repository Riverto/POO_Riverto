/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;

import java.util.ArrayList;

/**
 *
 * @author Riverto
 */
public class MobilePhone {
    private ArrayList<Contact> contacts;
    public MobilePhone(){
        this.contacts = new ArrayList();
    }
    public boolean addContact(Contact contact){
        if(findContact(contact) == null){
            this.contacts.add(contact);
            return true;
        } else return false;
    }
    public boolean addContact(String name, long number){
        return addContact(new Contact(name,number));
    }
    public boolean removeContact(Contact contact){
        Contact temp = findContact(contact);
        if(temp != null){
            this.contacts.remove(temp);
            return true;
        } else return false;
    }
    public boolean removeContact(String name){
        return addContact(new Contact(name,00));
    }
    public boolean updateContact(Contact contact){
        Contact temp = findContact(contact);
        if(temp != null){
            this.contacts.remove(temp);
            this.contacts.add(contact);
            return true;
        } else return false;
    }
    public boolean updateContact(String name, long number){
        return updateContact(new Contact(name, number));
    }
    public Contact findContact(Contact contact){
        for(Contact temp : this.contacts){
            if((temp.getName().equalsIgnoreCase(contact.getName()))) return temp;
        }
        return null;
    }
    public void getContacts(){
        String list="\tContacts={\n";
        for (Contact temp : this.contacts) {
            list+="\t"+temp+"\n";
        }
        list+="}";
        System.out.println(list);
    }
}
