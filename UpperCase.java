//Обработка текста: перевод в маленькие буквы (нижний регистр)
import java.util.Scanner;
public class UpperCase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String ourString = sc.nextLine();
		String newOurString = ourString.toUpperCase();
		System.out.println(newOurString);
	}
}
