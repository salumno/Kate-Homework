//Перевод двоичного числа в десятичное
import java.util.Scanner;
public class FromBinaryToDecimal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String binaryNumber = sc.nextLine();
		int x = 0;
		for (int i = 0; i < binaryNumber.length(); i++) {
			String stringNum = Character.toString(binaryNumber.charAt(i));
			int num = Integer.parseInt(stringNum);
			x = 2*x + num;
		}
		System.out.println(x);
	}
}
