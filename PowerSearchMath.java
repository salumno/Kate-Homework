//Возведение числа в степень.
import java.util.Scanner;
public class PowerSearchMath {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вводите число.");
		int num = sc.nextInt();
		System.out.println("Вводите степень, в которую хотите возвести число.");
		int power = sc.nextInt();
		double currentPower = Math.pow(num,power);
		System.out.println(num + "^" + power + " = " + currentPower);
	}
}
