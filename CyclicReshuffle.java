//Циклический сдвиг элементов массива вправо
public class CyclicReshuffle {
	public static void main (String[] args) {
		int size = 10;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		int lastElement = array[array.length-1];
		for (int i = array.length-2; i >= 0; i--) {
			array[i+1] = array[i];
		} 
		array[0] = lastElement;
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
