/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Riverto
 */
public abstract class Player {
    String name;

    public Player(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
