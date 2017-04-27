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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Team<SoccerPlayer> soccer1 = new Team("Soccer1");
        Team<SoccerPlayer> soccer2 = new Team("Soccer2");
        Team<VolleyballPlayer> volley = new Team("volley");
        
        SoccerPlayer asd = new SoccerPlayer("asd");
        SoccerPlayer qwe = new SoccerPlayer("qwe");
        
        VolleyballPlayer zxc = new VolleyballPlayer("zxc");
        
        soccer1.addPlayer(asd);
        soccer1.addPlayer(qwe);
        //soccer1.addPlayer(zxc);
        
        soccer1.matchResult(soccer2, 10, 5);
        soccer1.matchResult(soccer2, 10, 5);
        soccer2.matchResult(soccer1, 10, 5);
        soccer2.matchResult(soccer1, 4, 5);
        
        League<SoccerPlayer> soccerLeague = new League("Soccer League");
        
        soccerLeague.addTeam(soccer2);
        soccerLeague.addTeam(soccer1);
        //soccerLeague.addTeam(volley);
        
        soccerLeague.showTeams();
    }
    
}
