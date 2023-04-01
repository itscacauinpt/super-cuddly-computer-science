package loopStructures;

public class LoopWhile {
	public static void main(String[] args) {
		int subscribers = 10;
		int firstSubs = 0;
		int cupons = 5;
		
		while(firstSubs <= cupons) {
			printMessage("Subscriber " + firstSubs + " got a cupon!");
			firstSubs += 1;
		}
		
		printMessage("We've got " + subscribers + " subscribers.");
	}
	
	static void printMessage(String message) {
		System.out.println(message);
	}

}
