//Поиск среднего арифметического в массиве
import java.util.Scanner;
public class SearchOfArithmeticMean {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write size of array");
		int size = sc.nextInt();
		int[] array = new int[size];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			sum = sum + array[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
		float mean = ((float)sum) / size;
		//int mean2 = sum % size;
		System.out.println("Arithmetic mean = " + mean);
	}
}
