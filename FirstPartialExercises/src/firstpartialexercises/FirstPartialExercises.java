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
        Account diana = new Account("1", "diana", 50000);
        Account Angel = new Account("2", "angel", 6000);
        diana.transferTo(Angel, 6000);
    }
    
}