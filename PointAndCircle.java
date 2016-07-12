//Попадает ли точка M(x,y) в круг с центром O(Xc,Yc) и радиусом R
import java.util.Scanner;
public class PointAndCircle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки М(x,y)");
		double xPoint = sc.nextDouble();
		double yPoint = sc.nextDouble();
		System.out.println("Введите координаты точки O(x0,y0)");
		double xCircleCenter = sc.nextDouble();
		double yCircleCenter = sc.nextDouble();
		System.out.println("Длина радиуса круга = ");
		double radius = sc.nextDouble();
		double lengthBetweenCenterAndPoint = Math.sqrt(Math.pow(xPoint-xCircleCenter,2)+Math.pow(yPoint-yCircleCenter,2));
		if (lengthBetweenCenterAndPoint > radius) {
			System.out.println("Точка лежит за пределами круга");
		}
		else {
			System.out.println("Точка лежит внутри круга");
		}
	}
}	
