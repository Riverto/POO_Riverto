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
public class MyPoint {
    private int x,y;
    
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] XY = new int[2];
        XY[0]=this.x;
        XY[1]=this.y;
        return XY;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x, int y){
        double d;
        d = Math.sqrt(Math.pow((this.x-x), 2)+Math.pow((this.y-y), 2));
        return d;
    }
    public double distance(MyPoint another){
        double d;
        d = Math.sqrt(Math.pow((this.x-another.x), 2)+Math.pow((this.y-another.y), 2));
        return d;
    }
    public double distance(){
        double d;
        d = Math.sqrt(Math.pow((this.x), 2)+Math.pow((this.y), 2));
        return d;
    }
}
