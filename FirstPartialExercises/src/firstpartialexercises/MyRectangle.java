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
public class MyRectangle {
    private MyPoint a,b;
    
    public MyRectangle(int x1, int y1, int x2,int y2){
        this.a = new MyPoint(x1,y1);
        this.b = new MyPoint(x2,y2);
        //this.a=a;
        //this.b=b;
    }
    public MyRectangle(MyPoint a, MyPoint b){
        this.a=a;
        this.b=b;
    }
    public MyPoint getA() {
        return a;
    }
    public void setA(MyPoint a) {
        this.a = a;
    }
    public void setA(int x, int y){
        this.a.setXY(x, y);
    }
    public MyPoint getB() {
        return b;
    }
    public void setB(MyPoint b) {
        this.b = b;
    }
    public void setB(int x, int y){
        this.b.setXY(x, y);
    }
    @Override
    public String toString(){
        return "MyRectangle[a="+this.a+",b="+this.b+"]";
    }
    public double getArea(){
        return (this.a.getX()-this.b.getX())*(this.b.getY()-this.a.getY());
    }
    public double getPerimeter(){
        return ((this.a.getX()-this.b.getX())+(this.b.getY()-this.a.getY()))*2;
    }
}
