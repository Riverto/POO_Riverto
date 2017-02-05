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
public class Time {
    private int hour,minute,second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString(){
        return String.format("%02d", this.hour)+":"+String.format("%02d", this.minute)+":"+String.format("%02d", this.second);
    }
    public Time nextSecond(){
        Time temp = new Time(this.hour, this.minute, this.second); //crea un Objeto Time temporal para no modificar el valor de el objeto original
        if(temp.second+1==60){
            temp.second=0;
            if(temp.minute+1==60){
                temp.minute=0;
                if(temp.hour+1==24){
                    temp.hour=0;
                }else ++temp.hour;
            } else ++temp.minute;
        } else ++temp.second;
        return temp; //regresa el objeto temporal
    }
    public Time previousSecond(){
        Time temp = new Time(this.hour, this.minute, this.second); //crea un Objeto Time temporal para no modificar el valor de el objeto original
        if(temp.second-1<00){
            temp.second=59;
            if(temp.minute-1<00){
                temp.minute=59;
                if(temp.hour-1<00){
                    temp.hour=23;
                }else --temp.hour;
            } else --temp.minute;
        } else --temp.second;
        return temp; //regresa el objeto temporal
    }
}
