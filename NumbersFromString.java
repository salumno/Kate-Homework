//Обработка текста: выделение чисел из текста
import java.util.Scanner;
public class NumbersFromString {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String currentString = sc.nextLine();
		String number = new String();
		int k = 0;
		String ourString = currentString.concat(".");
		for (int i = 0; i < ourString.length(); i++) {
			char symbol = ourString.charAt(i);
			if (symbol >= '0' && symbol <= '9') {
				k++;
				number = number + symbol;
			}
			else {
				if (k != 0) {
					k = 0;
					System.out.println(number);
					number = "";
				}
			}
		}
	}
}
