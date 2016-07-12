//Решение системы 3-х уравнений с тремя неизвестными0
import java.util.Scanner;
public class TripleSystemOfEquation {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите коэффициенты уравнения a1*x+b1*y+c1*z=d1");
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double c1 = sc.nextDouble();
		double d1 = sc.nextDouble();
		System.out.println("Введите коэффициенты уравнения a2*x+b2*y+c2*z=d2");
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println("Введите коэффициенты уравнения a3*x+b3*y+c3*z=d3");
		double a3 = sc.nextDouble();
		double b3 = sc.nextDouble();
		double c3 = sc.nextDouble();
		double d3 = sc.nextDouble();
		double d = a1*b2*c3 + a2*b3*c1 + b1*c2*a3 -a3*b2*c1 - a2*b1*c3 - a1*c2*b3; System.out.println(d);
		double dX = d1*b2*c3 + d2*b3*c1 + b1*c2*d3 -d3*b2*c1 - d2*b1*c3 - d1*c2*b3;System.out.println(dX);
		double dY = a1*d2*c3 + a2*d3*c1 + d1*c2*a3 -a3*d2*c1 - a2*d1*c3 - a1*c2*d3;System.out.println(dY);
		double dZ = a1*b2*d3 + a2*b3*d1 + b1*d2*a3 -a3*b2*d1 - a2*b1*d3 - a1*d2*b3;System.out.println(dZ);
		if (d == 0 && (dX == 0 || dY == 0 || dZ == 0)) {
			System.out.println("Бесконечное множество решений");
		}
		else {
		//	if (d != 0 && (dX == 0 || dY == 0 || dZ == 0)) {
		//		System.out.println("Нет решений");
		//	}
		//	else {
				double x = dX / d;
				double y = dY / d;
				double z = dZ / d;
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("z = " + z);
		//	}
		}
	}
}
