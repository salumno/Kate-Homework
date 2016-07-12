//Перевод десятичного числа в двоичное
import java.util.Scanner;
public class FromDecimalToBinary {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number in decimal number system.");
		int x = sc.nextInt();
		String binaryNumber = new String();
		while (x > 0) {
			int mod = x % 2;
			String modString = Integer.toString(mod);
			binaryNumber = modString.concat(binaryNumber);
			x = x / 2;
		}
		System.out.println(binaryNumber);
	}
}
