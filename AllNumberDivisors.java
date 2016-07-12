//Печать всех делителей натурального числа A
import java.util.Scanner;
public class AllNumberDivisors {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = 1;
		double sqrt = Math.sqrt(number);
		while (n <= sqrt) {
			int mod = number % n;
			int div = number / n;
			if (mod == 0) {
				System.out.println(n);
				if (n != div) {
					System.out.println(div);
				}
			}
			n++;
		}
	}
}
