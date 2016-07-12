//Все ли элементы массива различны?
public class VariousElements {
	public static void main (String[] args) {
		int size = 5;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		boolean flag = true;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i] && i != j) {
					flag = false;
					break;
				}
			}
		if (flag) {
			System.out.println("Все элементы различны");
		}
		else {
			System.out.println("В массиве есть одинаковые элементы");
		}
	}
}
