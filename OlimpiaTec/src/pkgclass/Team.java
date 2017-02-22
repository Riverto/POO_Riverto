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
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Event> events;
    public Team(String Name){
        this.name = name;
        this.students = new ArrayList();
    }
    public String getName() {
        return this.name;
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
    public String getStudents(){
        String list="Students={\n";
        for (Student temp : this.students) {
            list+="\t"+temp.getStudent()+"\n";
        }
        return list;
    }
    @Override
    public String toString(){
        return "Team="+this.getName()+","+this.getStudents()+"}";
    }
}