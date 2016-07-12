//Решение уравнения: A*x^2 + B*x + C = 0
import java.util.Scanner;
public class Quadratic {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите коэффициенты a,b,c (a<>0)");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();	
		double d = b*b - 4*a*c;
		if (d < 0) {
			System.out.println("Нет действительных корней");
		}
		else {
			if (d == 0) {
				double x = (-b)/(2*a);
				System.out.println("x = " + x);
			}
			else {
				double x1 = (-b+Math.sqrt(d))/(2*a);
				double x2 = (-b-Math.sqrt(d))/(2*a);
				System.out.println("x1 = " + x1 + ", x2 = " + x2);
			}
		}
	}
}
