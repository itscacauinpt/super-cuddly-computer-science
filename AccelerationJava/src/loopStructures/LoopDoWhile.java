package loopStructures;
import java.util.Random;

public class LoopDoWhile {
	public static void main(String[] args) {
		String log;
		boolean delivered = false;
		int attemptedDelivery = 1;
		
		do {
			log = "Attempted delivery: " + attemptedDelivery;
			delivered = deliveryAttempt();
			attemptedDelivery += 1;
			printMessage(log);
		} while(!delivered);
		
		log = "Delivered at the " + (attemptedDelivery -1) + " attempt.";
		printMessage(log);
		
	}

	static boolean deliveryAttempt() {
		Random rand = new Random();
		boolean rand_bool = rand.nextBoolean();

		return rand_bool;
	}
	
	static void printMessage(String log) {
		System.out.println(log);
	}
}
