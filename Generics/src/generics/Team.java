/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;
import java.util.*;

/**
 *
 * @author Riverto
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    String name;
    int played=0;
    int win=0;
    int draw =0;
    int lose = 0;
    ArrayList<T> members = new ArrayList();
    
    public Team(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addPlayer(T p){
        if(members.contains(p)){
            System.out.println("Player "+p.getName()+"already in team.");
            return false;
        } else members.add(p);
        return true;
    }
    
    public int numPlayers() {
        return this.members.size();
    }
    
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            win++;
            message= " beat ";
        } else if (ourScore == theirScore){
            draw++;
            message = " drew with ";
        } else {
            lose++;
            message = " lost to ";
        }
        played++;
        if(opponent !=null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
    
    public int getPlayed(){
        return played;
    }
    
    public int ranking(){
        return (this.win*2)+this.draw;
    }

    @Override
    public int compareTo(Team<T> o) {
            if(this.ranking() > o.ranking()){
                return -1;
            } else if( this.ranking() < o.ranking()){
                return 1;
            } else if (this.ranking() == o.ranking()){
                if (this.getPlayed() < o.getPlayed()){
                    return -1;
                }    
            }
            return 0;
    }
}
