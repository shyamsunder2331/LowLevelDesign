package SnakeAndLadder;
public class Dice {
    int dice;
    public Dice(int dice){
        this.dice=dice;
    }
    public int rollDice(){
        return 1*dice+(int)( Math.random()*((6*dice-1)));
    }
}
