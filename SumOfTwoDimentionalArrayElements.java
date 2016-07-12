//Подсчет суммы элементов двумерного массива
public class SumOfTwoDimentionalArrayElements {
	public static void main (String[] args) {
		int[][] array = new int[4][3];
		int sum = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 3; j++) {
				array[i][j] = (int)(Math.random() * 10);
				sum = sum + array[i][j];
				if (j == 2) {
					System.out.println(array[i][j]);
				}
				else {
					System.out.print(array[i][j] + " ");
				}
			}
		System.out.println("sum = " + sum);
	}
}
