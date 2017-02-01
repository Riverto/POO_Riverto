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
public class Circle1 {
    private double radius;
    private String color;
    
    public Circle1(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle1(double radius){
        this.radius=radius;
        this.color="red";
    }
    public Circle1(String color){
        this.radius=1.0;
        this.color=color;
    }
    public Circle1(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Circle[radius="+this.radius+",color="+this.color+"]";
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
}
