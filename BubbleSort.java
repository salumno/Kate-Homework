// Сортировка "пузырек". Говно всплывает наружу.
public class BubbleSort {
	public static void main (String[] args) {
		int[] array = new int[10];
		System.out.println("Массив до сортировки:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Отсортированный массив:");
		for (int i = 0; i < array.length - 1; i++ ) {
			boolean flag = true;
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = false;
				}
			}
			if (flag) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
