import java.util.Random;
import java.util.*;
public class SnakesLadder {
	
	static final int startPos=0;
	static final int finalPos=100;
	Scanner sc = new Scanner(System.in);
	Random rand=new Random();
	static int rollDice;
	static int position;
	static int count;
	public SnakesLadder() {
		System.out.println("Welcome to Snake and Ladder Game");
		position=startPos;
		count=startPos;
	}
	public void rollingDice()
	{
		rollDice=rand.nextInt(6)+1;
		count++;
	}
	public void options()
	{
		int option=rand.nextInt(3);
		switch (option) {
		case 0:
			System.out.println("No Play");
			System.out.println("Position does not change.");
		break;
		case 1:
			System.out.println("Ladder");
			position=position+rollDice;
			if(position>100)
			{
				position=position-rollDice;
			}
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
	public static void main(String[] args) {
		SnakesLadder obj= new SnakesLadder();
		System.out.println("Initial Position: "+startPos);
		while(position<finalPos)
		{
		obj.rollingDice();
		obj.options();
		System.out.println("New Position: "+position);
		}
		System.out.println("The player has won: " +position);
		System.out.println("The number of times the dice was rolled " +count +" times");
	}

}