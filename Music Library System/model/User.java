import java.util.*;
class User{
    private String name;
    private final List<PlayList> playlists=new ArrayList<>();

    public User(String name){
        this.name=name;
    }
    public PlayList createPlayList(String name){
        PlayList playlist=new PlayList(name);
        playlists.add(playlist);
        return playlist;
    }
    public void deletePlayList(String name){
        if(!playlists.contains(name)){
            System.out.println("PlayList is not found");
        }else{
            playlists.remove(name);
            System.out.println("Playlist has been deleted successfully");
        }
    }
    public String getName(){
        return this.name;
    }
}