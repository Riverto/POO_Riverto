/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Riverto
 */
public class League<T extends Player> {
    String name;
    ArrayList<Team<T>> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public boolean addTeam(Team<T> t){
        if(teams.contains(t)){
            System.out.println("Team "+t.getName()+"already in this league.");
            return false;
        } else teams.add(t);
        return true;
    }
    
    public void showTeams() {
        Collections.sort(teams);
        int i=1;
        for(Team temp: teams){
            System.out.println(i++ +". "+ temp.getName() +" - " + temp.ranking());
        }
    } 
}
