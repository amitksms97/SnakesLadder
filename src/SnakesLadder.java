import java.util.Random;
public class SnakesLadder {

	static int rollDice;
	static int position;
	public SnakesLadder() {
		System.out.println("Welcome to Snake and Ladder Game");
		position=0;
	}
	public void RollingDice()
	{
		Random rand=new Random();
		rollDice=rand.nextInt(6)+1;
	}
	public static void main(String[] args) {
		SnakesLadder obj= new SnakesLadder();
		System.out.println("Initial Position: "+position);
		obj.RollingDice();
		System.out.println("New Position: "+rollDice);
	}

}