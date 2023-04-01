package loopStructures;
import java.util.Random;

public class LoopIfsElses {
	public static void main(String[] args) {
		int result = getRandomNumber();
		
		if(result > 7) {
			printMessage("YAY, you got to the next level!");
		} else {
			printMessage("sowy, you suck ><");
		}
	}
	
	// using util.Random and Math.random
	static int getRandomNumber() {
		Random rand = new Random();
//		int max = 10;
//		int min = 1;
//		int int_rand = (int)Math.floor(Math.random() * (max - min + 1) + min);
		int upperBound = 10;
		int int_rand = rand.nextInt(upperBound);

		return int_rand;
	}
	
	static void printMessage(String message) {
		System.out.println(message);
	}
}
