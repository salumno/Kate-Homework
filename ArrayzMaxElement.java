//Поиск максимального элемента в массиве
public class ArrayzMaxElement {
	public static void main (String[] args) {
		int[] array = new int[10];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			if (array[i] > max) {
				max = array[i];
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("max = " + max);
	}
}
