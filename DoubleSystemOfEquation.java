//Решение системы 2-х уравнений с двумя неизвестными
import java.util.Scanner;
public class DoubleSystemOfEquation {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите коэффициенты уравнения a1*x+b1*y=c1");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		System.out.println("Введите коэффициенты уравнения a2*x+b2*y=c2");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double d = a1*b2 - b1*a2;
		double dX = c1*b2 - b1*c2;
		double dY = a1*c2 - c1*a2;
		if (d == 0 && (dX == 0 || dY == 0)) {
			System.out.println("Бесконечное множество решений");
		}
		else {
			if (d != 0 && (dX == 0 || dY == 0)) {
				System.out.println("Нет решений");
			}
			else {
				double x = dX / d;
				double y = dY / d;
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
	}
}
