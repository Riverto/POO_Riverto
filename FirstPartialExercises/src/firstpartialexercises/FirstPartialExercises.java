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
public class FirstPartialExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author test2 = new Author("name", "email", 'x');
        Book1 test = new Book1("test", test2, 1);
        System.out.println(test.toString());
    }
    
}
