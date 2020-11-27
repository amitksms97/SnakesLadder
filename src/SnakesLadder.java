import java.util.Random;
import java.util.*;
public class SnakesLadder {
	
	static final int startPos=0;
	static final int finalPos=100;
	Scanner sc = new Scanner(System.in);
	Random rand=new Random();
	static int rollDice, position, count1, count2, finalposition1, finalposition2, rolldice1, rolldice2;
	public SnakesLadder() {
		System.out.println("Welcome to Snake and Ladder Game");
		position=startPos;
		finalposition1=startPos;
		finalposition2=startPos;
		count1=startPos;
		count2=startPos;
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
		case 0:
			System.out.println("No Play");
			System.out.println("Position does not change.");
		break;
		case 1:
			System.out.println("Ladder");
			position=position+rollDice;
			System.out.println("Position Incremented by:"+rollDice);
		break;
		case 2:
			System.out.println("Snakes");
			position=position-rollDice;
			System.out.println("Position Decremented by:"+rollDice);
			if(position<0)
			position=startPos;
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	
	public void playerOne()
	{
		rolldice1=rollingDice();
		count1++;
		options();
		finalposition1=finalposition1+position;
		if(finalposition1>100)
		{
			finalposition1=finalposition1-rolldice1;
		}
		System.out.println("Player 1 New Position: "+finalposition1);
	}
	public void playerTwo()
	{
		rolldice2=rollingDice();
		count2++;
		options();
		finalposition2=finalposition2+position;
		if(finalposition2>100)
		{
			finalposition2=finalposition2-rolldice2;
		}
		System.out.println("Player 2 New Position: "+finalposition2);
	}
	public static void main(String[] args) {
		SnakesLadder obj= new SnakesLadder();
		System.out.println("Initial Position: "+startPos);
		while(finalposition1<finalPos && finalposition2<finalPos)
		{
		obj.playerOne();
		obj.playerTwo();
		}
		if(finalposition1==100) {
		System.out.println("Player1 has won: ");
		System.out.println("The number of times the dice was rolled " +count1 +" times");
		}
		else if(finalposition2==100) {
			System.out.println("Player2 has won: ");
			System.out.println("The number of times the dice was rolled " +count2 +" times");
		}
		else
			System.out.println("Bad luck");
	}
}