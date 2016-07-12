//Подсчет различных букв в слове
import java.util.Scanner;
public class LetterCount {
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int n = 0;
	StringBuilder s = new StringBuilder(str);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '_') {
			n = n + 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == s.charAt(i)) {
					s.setCharAt(j, '_');
					}
				}
			}
		}
	System.out.println(n);
	}
}
