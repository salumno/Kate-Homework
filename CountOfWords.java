//Обработка текста: подсчет количества слов в тексте
import java.util.Scanner;
public class CountOfWords {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String currentString = sc.nextLine();
		int k = 0;
		int count = 0;
		String ourString = currentString.concat(".");
		for (int i = 0; i < ourString.length(); i++) {
			char symbol = ourString.charAt(i);
			if (symbol > 'A' && symbol < 'Z' || symbol > 'a' && symbol < 'z' || symbol == 'A' || symbol == 'Z' || symbol == 'a' || symbol == 'z') { //Ругается, если поставить нестрогие неравенства
				k++;
			}
			else {
				if (k != 0) {
					count++;
					k = 0;
				}
			}
		}
		System.out.println("Количество слов в строке = " + count);
	}
}
