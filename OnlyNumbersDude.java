//Не доработана
//Обработка текста: разрешение ввода только цифр
import java.util.Scanner;
public class OnlyNumbersDude {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to type a word. How's it going?");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
		}
	}
}
