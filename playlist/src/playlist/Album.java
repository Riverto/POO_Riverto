/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Riverto
 */
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs  = new ArrayList();
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==-1){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    public boolean addToPlaylist(int trackNumber, List<Song> playList){
        int index = trackNumber-1;
        if((index>=0)&&(index< this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlaylist(String title, List<Song> playList){
        int songIndex = findSong(title);
        if(songIndex!=-1){
            return addToPlaylist(songIndex+1, playList);
        }
        return false;
    }
    public int findSong(String title){
        for(Song temp: this.songs){
            if(temp.getTitle().equalsIgnoreCase(title)){
                return this.songs.indexOf(temp);
            }
        }
        return -1;
    }
}
