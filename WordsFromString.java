//Обработка текста: выделение слов из текста
import java.util.Scanner;
public class WordsFromString {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String currentString = sc.nextLine();
		String word = new String();
		int k = 0;
		String ourString = currentString.concat(".");
		for (int i = 0; i < ourString.length(); i++) {
			char symbol = ourString.charAt(i);
			if (symbol>'A' && symbol<'Z' || symbol>'a' && symbol<'z' || symbol=='A' || symbol=='Z' || symbol=='a' || symbol=='z') {
				k++;
				word = word + symbol;
			}
			else {
				if (k != 0) {
					k = 0;
					System.out.println(word);
					word = "";
				}
			}
		}
	}
}
