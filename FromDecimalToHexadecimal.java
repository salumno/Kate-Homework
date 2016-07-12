//Перевода десятичного числа в шестнадцатеричное
import java.util.Scanner;
public class FromDecimalToHexadecimal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number in decimal number system.");
		String hexadecimalNumber = new String();
		int x = sc.nextInt();
		char[] digits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while (x > 0) {
			int mod = x % 16;
			hexadecimalNumber = digits[mod] + hexadecimalNumber;
			x = x / 16;
		}
		System.out.println(hexadecimalNumber);
	}
}
