import java.util.Scanner;
public class CommentaryRemove {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String ourString = sc.nextLine();
		String newOurString = new String();
		boolean flag = true;
		for (int i = 0; i < ourString.length(); i++) {
			if (ourString.charAt(i) == '{') {
				flag = false;
			}
			else {
				if (ourString.charAt(i) == '}') {
					flag = true;
				}
			}
			if (flag && ourString.charAt(i) != '}') {
				newOurString = newOurString + ourString.charAt(i);
			}
		}
		System.out.println(newOurString);
	}
}
