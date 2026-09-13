
import java.util.*;
class Room{
    private int floor;
    private int roomNo;
    public Room(int floor,int roomNo){
        this.floor=floor;
        this.roomNo=roomNo;
    }
    public int getFloor(){
        return this.floor;
    }
    public int getRoomNo(){
        return this.roomNo;
    }
}