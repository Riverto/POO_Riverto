/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.util.ArrayList;

/**
 *
 * @author Riverto
 */
public class Student {
    private String name;
    private String id;
    private ArrayList<Event> events;
    
    public Student(String name, String id){
        this.name=name;
        this.id=id;
        this.events=new ArrayList();
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public boolean addEvent(Event event){
        for(Event temp : this.events) {
            if(temp.getName().equalsIgnoreCase(event.getName())){
                return false;
            }
        }
        this.events.add(event);
        return true;
    }
    public boolean removeSport(Event sport){
        for(Event temp : this.events) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                this.events.remove(temp);
            }
        }
        return false;
    }
    public String getEvents() {
        String list="Events=";
        for (Event temp : this.events) {
            list+=temp.getName()+",";
        }
        list=list.substring(0, list.length()-1);
        return list;
    }
    public String getStudent(){
        return "Name="+this.name+", Id="+this.id;
    }
    @Override
    public String toString(){
        return "Name="+this.name+", Id="+this.id+", "+getEvents();
    }
}