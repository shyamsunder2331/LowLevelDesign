import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        User u1=new User("shyam");
        PlayList westSide=u1.createPlayList("WestSide");
        PlayList bts=u1.createPlayList("BTS");
        PlayList tamil=u1.createPlayList("Tamil");
        PlayList telugu=u1.createPlayList("Telugu");

        Library lib=new Library();
        Song s1=new Song("manasa manasa","munna",4);
        Song s2=new Song("neelothi","sirra",5);
        Song s3=new Song("backbone","sandhu",6);
        Song s4=new Song("blue eyes","yo yo",5);
        Song s5=new Song("softly","karan aujla",5);
        
        lib.addSongs(List.of(s1,s2,s3,s4,s5));

        westSide.addSong(s1);
        westSide.addSong(s3);
        bts.addSong(s4);
        bts.addSong(s2);
        bts.addSong(s5);
        List<Song> res=westSide.getPlayList();
        for(Song i:res) System.out.print(i.getTitle()+"  ");
        List<Song> rest=bts.getPlayList();
        for(Song i:rest) System.out.print(i.getTitle()+"  ");
        bts.deleteSong(s5);
        for(Song i:rest) System.out.print(i.getTitle()+"  ");

    }
}