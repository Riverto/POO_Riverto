package pkgclass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Riverto
 */
public class Team {
    private char name;
    private ArrayList<Student> students;
    private ArrayList<Event> events;
    public Team(char Name){
        this.name = name;
        this.students = new ArrayList();
    }
    public char getName() {
        return name;
    }
    public boolean addStudent(Student student){
        for(Student temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        return true;
    }
    public boolean addEvent(Event event){
        for(Event temp : this.events){
            if(temp.getName().equalsIgnoreCase(event.getName())){
                return false;
            }
        }
        this.events.add(event);
        return true;
    }
}