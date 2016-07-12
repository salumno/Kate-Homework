//Подсчет суммы элементов одномерного массива
public class SumOfArrayElements {
	public static void main (String[] args) {
		int[] array = new int[10];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			sum = sum + array[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
	}
}
