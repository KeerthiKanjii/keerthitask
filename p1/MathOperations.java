package p1;

import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.out;
public class MathOperations {
public static void main(String[] args) {
	System.out.println("Enter Two Integers");
	Scanner scanner = new Scanner(System.in);
	int num1 = parseInt(scanner.next());
	int num2 = parseInt(scanner.next());
	int result=num1 + num2 ;
	System.out.println("Maximum number of num1 and num2 is: " +Math.max(num1, num2)); 
	System.out.println("Square root of num2 is: " + Math.sqrt(num2)); 
}
}
