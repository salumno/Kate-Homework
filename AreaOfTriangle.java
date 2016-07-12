//Вычисление площади треугольника по 3 вершинам
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки А(x1,y1)");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Введите координаты точки B(x2,y2)");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Введите координаты точки C(x3,y3)");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double side1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double side2 = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
		double side3 = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
		double p = (side1+side2+side3)/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		System.out.println("Площадь равна " + area);
	}
}
