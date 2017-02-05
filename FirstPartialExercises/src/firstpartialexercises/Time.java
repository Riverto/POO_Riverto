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
        if(this.getSecond()+1==60){
            this.setSecond(0);
            if(this.getMinute()+1==60){
                this.setMinute(0);
                if(this.getHour()+1==24){
                    this.setHour(0);
                }else this.setHour(this.getHour()+1);
            } else this.setMinute(this.getMinute()+1);
        } else this.setSecond(this.getSecond()+1);
        return this;
    }
    public Time previousSecond(){
        if(this.getSecond()-1<00){
            this.setSecond(59);
            if(this.getMinute()-1<00){
                this.setMinute(59);
                if(this.getHour()-1<00){
                    this.setHour(23);
                }else this.setHour(this.getHour()-1);
            } else this.setMinute(this.getMinute()-1);
        } else this.setSecond(this.getSecond()-1);
        return this;
    }
}