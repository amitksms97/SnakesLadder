import java.util.Random;
public class SnakesLadder {

	static int roll;
	static int position;
	public SnakesLadder() {
		System.out.println("Welcome to Snake and Ladder Game");
		position=0;
	}
	public void move()
	{
		Random rand=new Random();
		roll=rand.nextInt(6)+1;
	}
	public static void main(String[] args) {
		SnakesLadder obj= new SnakesLadder();
		System.out.println("Initial Position: "+position);
		obj.move();
		System.out.println(roll);
		

	}

}