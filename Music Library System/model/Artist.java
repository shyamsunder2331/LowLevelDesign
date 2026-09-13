import java.util.*;

class Artist{
    private String name;
    private final List<Song> songList=new ArrayList<>();
    public Artist(String name){
        this.name=name;
    }
    public void addSong(Song song){
        songList.add(song);
    }
    public List<Song> getSongs(){
        return songList;
    }
    public String getName(){
        return name;
    }
}