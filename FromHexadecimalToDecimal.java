//Перевода шестнадцатеричного числа в десятичное
import java.util.Scanner;
public class FromHexadecimalToDecimal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexadecimalNumber = sc.nextLine();
		int decimalNumber = 0;
		char[] digits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for (int i = 0; i < hexadecimalNumber.length(); i++) {
			int j = 0;
			while (digits[j] != hexadecimalNumber.charAt(i)) {
				j++;
			}
			decimalNumber = 16*decimalNumber+j;
		}
		System.out.println(decimalNumber);
	}
}
