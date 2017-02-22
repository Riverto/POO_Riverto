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
public class Event {
    private String name;
    private ArrayList<Student> students;
    
    public Event(String name){
        this.name=name;
        this.students=new ArrayList();
    }
    public String getName() {
        return name;
    }
    public boolean addStudent(Student student){
        for(Student temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        student.addEvent(this);
        return true;
    }
    public boolean removeStudent(Student student){
        for(Student temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                students.remove(temp);
                return true;
            }
        } return false;
    }
    @Override
    public String toString(){
        String string="Event="+this.getName()+"\nAttendees={\n";
        for (Student student : students) {
            string+="\t Name="+student.getName()+",ID="+student.getId()+"\n";
        }
        string += "\t }";
        return string;
    }
}
