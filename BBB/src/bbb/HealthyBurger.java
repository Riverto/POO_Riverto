/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;

/**
 *
 * @author Riverto
 */
public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("brown rye", meat, price);
        type="HealthyBurger";
        limAdditions=6;
    }
}
