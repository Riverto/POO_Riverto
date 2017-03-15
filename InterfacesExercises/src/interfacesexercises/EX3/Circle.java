/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises.EX3;

/**
 *
 * @author Riverto
 */
public class Circle implements GeometricObject{
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    
    
}
