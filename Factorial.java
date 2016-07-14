//Calculation of factorial

import java.util.Scanner;

public class Factorial {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number which factorial you wanna calculate");
		int number = sc.nextInt();
		System.out.print(number + "! = ");
		int numbersFactorial;
		if (number == 1) {
			numbersFactorial = 1 ;
		} else {
			int counter = number - 1;
			while (counter > 1) {
				number = number * counter;
				counter--;
			}
			numbersFactorial = number;
		}
		System.out.println(numbersFactorial);
	}
}
