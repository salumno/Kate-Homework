//Какая точка (A или B) ближе к началу координат
import java.util.Scanner;
public class ShortestLength {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки А(x1,y1)");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Введите координаты точки B(x2,y2)");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double lengthA = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
		double lengthB = Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
		if (lengthA > lengthB) {
			System.out.println("Точка В ближе");
		}
		else {
			if (lengthA < lengthB) {
				System.out.println("Точка А ближе");
			}
			else {
				System.out.println("Расстояния равны");
			}
		}
	}
}
