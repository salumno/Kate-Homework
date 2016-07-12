//Поиск минимального элемента в массиве
public class ArrayzMinElement {
	public static void main (String[] args) {
		int[] array = new int[10];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			if (array[i] < min) {
				min = array[i];
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("min = " + min);
	}
}
