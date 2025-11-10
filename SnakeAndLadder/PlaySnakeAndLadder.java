package SnakeAndLadder;
import java.util.*;
public class PlaySnakeAndLadder {
    public static void main(String[] args){
        Dice dice=new Dice(2);
        Player player1=new Player("Shyam",1);
        Player player2=new Player("Venumadhav",1);
        Player player3=new Player("Punyavathi",1);
        Player player4=new Player("Nagesh",1);
        Queue<Player> allPlayers=new LinkedList<>();
        allPlayers.offer(player1);
        allPlayers.offer(player2);
        allPlayers.offer(player3);
        allPlayers.offer(player4);
        List<Jumper> Snakes=new ArrayList<>();
        Snakes.add(new Jumper(15,6));
        Snakes.add(new Jumper(43, 12));
        List<Jumper> Ladders=new ArrayList<>();
        Ladders.add(new Jumper(6,32));
        Ladders.add(new Jumper(25,54));
        int boardSize=100;
        Map<String,Integer> currentPosition=new HashMap<>();
        currentPosition.put("Shyam",1);
        currentPosition.put("Venumadhav",1);
        currentPosition.put("Punyavathi",1);
        currentPosition.put("Nagesh",1);
        GameBoard gb=new GameBoard(dice, Snakes, Ladders, boardSize, allPlayers, currentPosition);
        gb.startGame();
        System.out.println(allPlayers.poll().name+" is Last.");
    }
}
