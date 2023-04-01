package interactingUser;
import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Your name? ");
        String name = scanner.next();

        System.out.println("Welcome, " + name + "!");

        System.out.print("What would you like in this fine morning? ");
        String order = scanner.next();
        
        System.out.println("Sure, " + order + " !");

        scanner.close();

	}

}
