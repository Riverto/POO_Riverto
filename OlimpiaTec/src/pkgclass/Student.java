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
    private ArrayList<Sports> sports;
    
    public Student(String name, String id){
        this.name=name;
        this.id=id;
        this.sports=new ArrayList();
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public boolean addSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                return false;
            }
        }
        this.sports.add(sport);
        return true;
    }
    public boolean removeSport(Sports sport){
        for(Sports temp : this.sports) {
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                this.sports.remove(temp);
            }
        }
        return false;
    }
    public String getSports() {
        String list="Sports=";
        for (Sports temp : this.sports) {
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
        return "Name="+this.name+", Id="+this.id+", "+getSports();
    }
}