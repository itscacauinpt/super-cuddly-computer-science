package projectIMC;

public class Exam {
	public void ExamIMC(double heigh, double weigh) {
		double IMC = weigh / Math.pow(heigh, 2);
		System.out.println("Here's your IMC: " + IMC);
	}
}
