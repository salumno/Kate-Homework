// NOK and NOD xD

import java.util.Scanner;

public class DivisorAndMultiple {

	public static int greatestСommonDivisor (int a, int b) {
		int result;
		if (a != 0) {
			result = greatestСommonDivisor(b % a, a);
		} else {
			result = b;
		}
		return result;
	}
	
	public static int leastCommonMultiple (int a, int b) {
		int result = (a / greatestСommonDivisor(a,b) ) * b;
		return result;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write two integer numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Their greatest common divisor = " + greatestСommonDivisor(x,y));
		System.out.println("Their least common multiple = " + leastCommonMultiple(x,y));
	}
}
