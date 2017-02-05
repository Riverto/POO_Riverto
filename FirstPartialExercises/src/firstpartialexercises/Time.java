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
        if(second+1==60){
            second=0;
            if(minute+1==60){
                minute=0;
                if(hour+1==24){
                    hour=0;
                }else ++hour;
            } else ++minute;
        } else ++second;
        return this;
    }
    public Time previousSecond(){
        if(second-1<00){
            second=59;
            if(minute-1<00){
                minute=59;
                if(hour-1<00){
                    hour=23;
                }else --hour;
            } else --minute;
        } else --second;
        return this;
    }
}