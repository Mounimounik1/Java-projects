package JavaPackage;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
			
		}
		System.out.println("Factorial of " + number + "is" + factorial);
		// TODO Auto-generated method stub

	}

}
