/*-Точка принадлежит треугольнику или нет? 
 *-Что за вопросы вы задаете?
 *-Просто интересно.
 */
import java.util.Scanner;
public class TriangleAndPoint {
	
	public static double sideLength(double x1, double y1, double x2, double y2) {
		double result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return result;
	}
	
	public static double triangleSquare(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a = sideLength(x1,y1,x2,y2);
		double b = sideLength(x2,y2,x3,y3);
		double c = sideLength(x1,y1,x3,y3);
		double p = (a + b + c)/2;
		double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return square;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координаты точки.");
		double pointX = sc.nextDouble();
		double pointY = sc.nextDouble();
		double[][] apex = new double[3][2]; 
		System.out.println("Введите координаты первой вершины треугольника.");
		apex[0][0] = sc.nextDouble();
		apex[0][1] = sc.nextDouble();
		System.out.println("Введите координаты второй вершины треугольника.");
		apex[1][0] = sc.nextDouble();
		apex[1][1] = sc.nextDouble();
		System.out.println("Введите координаты третьей вершины треугольника.");
		apex[2][0] = sc.nextDouble();
		apex[2][1] = sc.nextDouble();	
		double currentTriangleSquare = triangleSquare(apex[0][0], apex[0][1], apex[1][0], apex[1][1], apex[2][0], apex[2][1]);
		double pointSquare1 = triangleSquare(apex[0][0], apex[0][1], apex[1][0], apex[1][1], pointX, pointY);
		double pointSquare2 = triangleSquare(pointX, pointY, apex[1][0], apex[1][1], apex[2][0], apex[2][1]);
		double pointSquare3 = triangleSquare(apex[0][0], apex[0][1], pointX, pointY, apex[2][0], apex[2][1]);
		if (currentTriangleSquare * 1.00001 > pointSquare1 + pointSquare2 + pointSquare3) {
			System.out.println("Точка принадлежит треугольнику");
		}
		else {
			System.out.println("Точка не принадлежит треугольнику");
		}
	}
}
