import java.util.*;
public class SnakesLadder {
    static final int START_POSITION=0;
    static final int FINAL_POSITION=100;
    Random rand=new Random();
    static int rollDice, position, count1, count2, finalPosition1, finalPosition2, rollDice1, rollDice2;
    public SnakesLadder() {
        System.out.println("Welcome to Snake and Ladder Game");
        position=START_POSITION;
        finalPosition1=START_POSITION;
        finalPosition2=START_POSITION;
        count1=START_POSITION;
        count2=START_POSITION;
    }
    public int rollingDice()
    {
        rollDice=rand.nextInt(6)+1;
        return rollDice;
    }
    public void options()
    {
        position=0;
        int option=rand.nextInt(3);
        switch (option) {
            case 0 -> {
                System.out.println("No Play");
                System.out.println("Position does not change.");
            }
            case 1 -> {
                System.out.println("Ladder");
                System.out.println("Mandatory Dice roll value: "+ rollDice);
                int newRoll=rand.nextInt(6)+1; // ladder value
                System.out.println("Ladder Dice roll value: "+ newRoll);
                position = position + rollDice + newRoll;
                System.out.println("Position Incremented by:" + (rollDice + newRoll));
            }
            case 2 -> {
                System.out.println("Snakes");
                System.out.println("Mandatory Dice roll value: "+ rollDice);
                position = position - rollDice;
                System.out.println("Position Decremented by: " + rollDice);
                if (position < 0)
                    position = START_POSITION;
            }
            default -> System.out.println("Invalid Input");
        }
    }

    public void playerOne()
    {
        rollDice1=rollingDice();
        count1++;
        options();
        finalPosition1=finalPosition1+position;
        if(finalPosition1>100)
        {
            finalPosition1=finalPosition1-rollDice;
        }
        System.out.println("Player 1 New Position: "+finalPosition1);
    }
    public void playerTwo()
    {
        rollDice2=rollingDice();
        count2++;
        options();
        finalPosition2=finalPosition2+position;
        if(finalPosition2>100)
        {
            finalPosition2=finalPosition2-rollDice2;
        }
        System.out.println("Player 2 New Position: "+finalPosition2);
    }
    public static void main(String[] args) {
        SnakesLadder obj= new SnakesLadder();
        System.out.println("Initial Position: "+START_POSITION);
        while(finalPosition1<FINAL_POSITION && finalPosition2<FINAL_POSITION)
        {
            System.out.println("Player 1 plays-");
            obj.playerOne();
            System.out.println("________________________________________________");
            System.out.println("Player 2 plays-");
            obj.playerTwo();
            System.out.println("________________________________________________");
        }
        if(finalPosition1==100) {
            System.out.println("Player1 has won: ");
            System.out.println("The number of times the dice was rolled " +count1 +" times");
        }
        else if(finalPosition2==100) {
            System.out.println("Player2 has won: ");
            System.out.println("The number of times the dice was rolled " +count2 +" times");
        }
        else
            System.out.println("Bad luck");
    }
}