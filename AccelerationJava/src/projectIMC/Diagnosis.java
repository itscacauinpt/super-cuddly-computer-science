package projectIMC;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Diagnosis {

	public static void main(String[] args) {
		double heigh, weigh;
		Exam instanceExam = new Exam();
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Your name? ");
//        String name = scanner.next();
//        
//        System.out.println("Welcome, " + name + "! Now, to calculate your IMC, I need you to tell me your heigh.");
//        String userHeigh = scanner.next();
//
//        System.out.println("And your weigh.");
//        String userWeigh = scanner.next();
//        scanner.close();

//        double heigh = Double.parseDouble(userHeigh);
//        double weigh = Double.parseDouble(userWeigh);
		heigh = Double.parseDouble(JOptionPane.showInputDialog("Tell me your heigh: "));
		weigh = Double.parseDouble(JOptionPane.showInputDialog("Now, your weigh: "));
        
        instanceExam.ExamIMC(heigh, weigh);
	}
}
