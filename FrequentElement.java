//Печать самого часто встречающегося элемента из массива
public class FrequentElement {
	public static void main (String[] args) {
		int size = 5;
		int indexOfFrequentElement = -1; //Можно провести инициализацию, не присваивая никакого значения?
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i]);
		}
		int maxCount = 0;
		for (int i = 0; i < array.length; i++) {
			int currentCount = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i]) {
					currentCount++;
				}
			}
			if (currentCount > maxCount) {
				maxCount = currentCount;
				indexOfFrequentElement = i;
			}
		}
		System.out.println();
		System.out.println(array[indexOfFrequentElement]);
	}
}
