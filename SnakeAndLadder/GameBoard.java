package SnakeAndLadder;
import java.util.*;
public class GameBoard {
    private Dice dice;
    private List<Jumper> Snakes;
    private List<Jumper> Ladders;
    int boardSize;
    private Queue<Player> nextTurn;
    private Map<String,Integer> currentPos;
    GameBoard(Dice dice,List<Jumper> Snakes,List<Jumper> Ladders,int boardSize,Queue<Player> nextTurn,Map<String,Integer> currentPos){
        this.dice=dice;
        this.Snakes=Snakes;
        this.Ladders=Ladders;
        this.boardSize=boardSize;
        this.nextTurn=nextTurn;
        this.currentPos=currentPos;
    }
    public void startGame(){
        int rank=1;
        while(nextTurn.size()>1){
            Player player=nextTurn.poll(); 
            int currentPosition=currentPos.get(player.name);
            int nextCell=currentPosition+dice.rollDice();
            if(nextCell==boardSize){
                    System.out.println(player.name+" Have won the game with Rank :"+rank);
                    rank+=1;
            }else if(nextCell>boardSize){
                nextTurn.offer(player);
            }else{
                int[] nextPos=new int[1];
                boolean[] b=new boolean[1];
                nextPos[0]=nextCell; 

                Snakes.forEach(v->{
                    if(v.startPosition==nextCell){
                        nextPos[0]=v.endPosition;
                }});
                if(nextPos[0]!=nextCell) System.out.println(player.name+" is bitten by snake");

                Ladders.forEach(v->{
                    if(v.startPosition==nextCell){
                        nextPos[0]=v.endPosition;
                        b[0]=true;
                }});
                if(nextPos[0]!=nextCell) System.out.println(player.name+ " has climbed ladder");

                if(nextPos[0]==boardSize){
                    System.out.println(player.name+" has won the game");
                }else{
                    currentPos.put(player.name,nextPos[0]);
                    System.out.println(player.name+" has moved to "+ nextPos[0]);
                    nextTurn.offer(player);
                }
            }
        }
    }
}
