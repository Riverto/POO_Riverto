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
        Student esteban = new Student("Esteban", "A00000000");
        Sports basketball = new Sports("Basketball");
        Sports soccer = new Sports("Soccer");
        soccer.addStudent(esteban);
        System.out.println(soccer);
        System.out.println(esteban);
        Student rodrigo = new Student("Rodrigo", "A07025360");
        Student rodrigo2 = new Student("Rodrigo", "A07025360");
        if(soccer.addStudent(rodrigo)){System.out.println("success");} else System.out.println("failed");
        if(soccer.addStudent(rodrigo2)){System.out.println("success");} else System.out.println("failed");
        System.out.println(soccer);
        soccer.removeStudent(rodrigo);
        System.out.println(soccer);
        basketball.addStudent(rodrigo);
        System.out.println(rodrigo);
        System.out.println(rodrigo.getSports());
        System.out.println(esteban.getSports());
    }
}