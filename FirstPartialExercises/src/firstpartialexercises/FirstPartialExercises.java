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
        MyRectangle test = new MyRectangle(2,0,0,2);
        System.out.println(test.getA());
        System.out.println(test.getB());
        System.out.println(test);
        System.out.println(test.getArea());
        MyPoint a = new MyPoint(3,0);
        MyPoint b = new MyPoint(0,3);
        MyRectangle test2 = new MyRectangle(a,b);
        System.out.println(test2.getA());
        System.out.println(test2.getB());
        System.out.println(test2);
        System.out.println(test2.getArea());
    }
}
