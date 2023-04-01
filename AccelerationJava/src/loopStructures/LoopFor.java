package loopStructures;

public class LoopFor {
	public static void main(String[] args) {
		String names[] = new String[] {"Paul", "Marcus", "Leon", "Ashley"};
		
		for(int index = 0; index < names.length; index += 1) {
			printMessage("We've got " + names[index] + " in the crew.");
		}
	}

	static void printMessage(String message) {
		System.out.println(message);
	}

}
