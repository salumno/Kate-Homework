//Проверка на палиндромность
import java.util.Scanner;
public class Palindrome {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	StringBuilder s = new StringBuilder(str);
	boolean flag = false;
	int stringMiddle = s.length() / 2;
		for (int i = 0; i <= stringMiddle; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
			flag = true;
			break;
			}
		}
		if (flag) {
		System.out.println("Не палиндром");
		}
		else {
		System.out.println("Палиндром");
		}
	}
}
