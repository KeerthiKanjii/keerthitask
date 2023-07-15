import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int score;
		char grade;

		Scanner console = new Scanner(System.in);

		System.out.print("Enter your numeric test score : ");
		score = console.nextInt();

		if (score >= 59) {
			grade = 'A';
		} else if (score >= 69) {
			grade = 'B';
		} else {
			grade = 'F';
		}

		System.out.println("Your grade is " + grade);
	}
}
