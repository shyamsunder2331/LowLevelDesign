import java.util.*;
class PlayList{
    private String name;
    private final List<Song> songList=new ArrayList<>();
    public PlayList(String name){
        this.name=name;
    }
    public List<Song> getPlayList(){
        return songList;
    }
    public String getName(){
        return this.name;
    }
    public void addSong(Song s){
        songList.add(s);
        System.out.println("song added successfully to the playlist "+this.name);
    }
    public void deleteSong(Song song){
        songList.remove(song);
        System.out.println("song removed successfully from the playlist "+this.name);
    }
}