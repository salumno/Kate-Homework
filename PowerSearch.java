//Возведение числа в степень
import java.util.Scanner;
public class PowerSearch {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вводите число.");
		int num = sc.nextInt();
		System.out.println("Вводите степень, в которую хотите возвести число.");
		int power = sc.nextInt();
		int p = power;
		long currentPower = 1;
		while (p > 0) {
			currentPower = num * currentPower;
			p--; 
		}
		System.out.println(num + "^" + power + " = " + currentPower);
	}
}
