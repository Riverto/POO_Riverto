/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_1;

/**
 *
 * @author Riverto
 */
public class Animal {
    private String reproductionMethod;
    private String name;
    private int eyes;
    private int brain;

    public Animal(String reproductionMethod,String name, int eyes,int brain){
        this.reproductionMethod=reproductionMethod;
        this.name=name;
        this.eyes=eyes;
        this.brain=brain;
    }
    public void move(){
        System.out.println("Animal.move() called");
    }
    public void eat(){
        System.out.println("Animal.eat() called");
    }
}
