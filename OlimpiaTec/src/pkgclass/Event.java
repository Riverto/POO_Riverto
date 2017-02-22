/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.util.ArrayList;

/**
 *
 * @author Riverto
 */
public class Event {
    private String name;
    private ArrayList<Team> teams;
    
    public Event(String name){
        this.name=name;
        this.teams=new ArrayList();
    }
    public String getName() {
        return name;
    }
    public boolean addTeam(Team team){
        for(Team temp : this.teams) {
            if(temp.getName().equalsIgnoreCase(team.getName())){
                return false;
            }
        }
        this.teams.add(team);
        team.addEvent(this);
        return true;
    }
    @Override
    public String toString(){
        String string="Event"+this.name+"{\n";
        for (Team team : teams) {
            string+="\t"+team.toString()+"\n";
        }
        string += "}";
        return string;
    }
}
