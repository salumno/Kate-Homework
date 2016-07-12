//Перестановка букв в слове (циклический сдвиг вправо)
import java.util.Scanner;
public class LetterReshuffle {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	StringBuilder s = new StringBuilder(str);
	char c = s.charAt(s.length()-1);
		for (int i = s.length()-2; i > -1; i--) {
		s.setCharAt(i+1, s.charAt(i));
		}
	s.setCharAt(0, c);
	System.out.println(s);
	}
}
