//Обработка текста: перевод в маленькие буквы (нижний регистр)
import java.util.Scanner;
public class LowerCase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String ourString = sc.nextLine();
		String newOurString = ourString.toLowerCase();
		System.out.println(newOurString);
	}
}
