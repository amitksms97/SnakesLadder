import java.util.Random;
import java.util.*;
public class SnakesLadder {
	
	static final int startPos=0;
	Scanner sc = new Scanner(System.in);
	Random rand=new Random();
	static int rollDice;
	static int position;
	public SnakesLadder() {
		System.out.println("Welcome to Snake and Ladder Game");
		position=0;
	}
	public void rollingDice()
	{
		rollDice=rand.nextInt(6)+1;
	}
	public void options()
	{
		int option=rand.nextInt(3);
		switch (option) {
		case 0: 
			System.out.println("No Play");
			position=0;
		break;
		case 1:
			System.out.println("Ladder");
			position=position+rollDice;
			if(position>100)
				position=100;
		break;
		case 2:
			System.out.println("Snakes");
			position=position-rollDice;
			if(position<0)
			position=0;
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		SnakesLadder obj= new SnakesLadder();
		System.out.println("Initial Position: "+startPos);
		obj.rollingDice();
		obj.options();
		System.out.println("New Position: "+position);
		

	}

}