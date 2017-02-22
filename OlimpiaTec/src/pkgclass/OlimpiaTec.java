/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author Riverto
 */
public class OlimpiaTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Team Ingenieros = new Team("Ingenieros");
//        Team Licenciados = new Team("Licenciados");
//        Team Prepa1 = new Team("Prepa 1er año");
//        Team Prepa2 = new Team("Prepa 2do año");
//        Team Prepa3 = new Team("Prepa 3er año");
    Student leonn = new Student("Leon", "D10S");
    Student jaime = new Student("Jaime","A00821432");        
    Student esteban = new Student("Esteban","A01410412");        
    Event handball = new Event("Handball");        
    Event cagar = new Event("Cagar");        
    Team i = new Team("Ingenieros");        
    Team l = new Team("Licenciados");        
    Team p1 = new Team("Prepa - 1er Sem");        
    Team p3 = new Team("Prepa - 3er Sem");        
    Team p5 = new Team("Prepa - 5to Sem");              
    cagar.addStudent(leonn);        
    handball.addStudent(jaime);        
    cagar.addStudent(esteban);               
    System.out.println(cagar);        
    System.out.println(handball);        
    System.out.println(i);        
    System.out.println(l);        
    System.out.println(p1);        
    System.out.println(p3);        
    System.out.println(p5);
    }
}
