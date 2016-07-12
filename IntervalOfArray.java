//Печать всех элементов массива из интервала C..D
import java.util.Scanner;
public class IntervalOfArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		System.out.println("Введите значения концов отрезка [C,D](правый конец должен быть меньше или равен " + (size-1) + ").");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = c; i <= d; i++) {
				System.out.print(array[i] + " ");
		}
		
	}
}
