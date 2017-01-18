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
public class Dog extends Animal{
    private int legs;
    private int teeth;
    private String coat;
    private String breed;
    
    public Dog(String name,int legs, int teeth,String coat, String breed){
        super("sexual", name, 2,1);
        this.legs=legs;
        this.teeth=teeth;
        this.coat=coat;
        this.breed=breed;
    }
    @Override
    public void eat(){
        chew();
        super.eat();
    }
    public void chew(){
        System.out.println("Dog.chew() called");
    }
}
