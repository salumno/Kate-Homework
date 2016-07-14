//Сложение двоичных чисел столбиком
import java.util.Scanner;
public class BinaryNumbersAddition {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое двоичное число");
		String num1 = sc.nextLine();
		System.out.println("Введите второе двоичное число");
		String num2 = sc.nextLine();
		int gap = Math.abs(num1.length() - num2.length());
		int lengthOfString;
		if (num1.length() > num2.length()) {
			lengthOfString = num1.length();
			while (gap > 0) {
				num2 = '0' + num2;
				gap--;
			}
		} 
		else {
			lengthOfString = num2.length();
			while (gap > 0) {
				num1 = '0' + num1;
				gap--;
			}
		}
		int mod = 0;
		int resultOfAdd = 0;
		String sumOfNumbers = new String();
		for (int i = lengthOfString-1; i > -1; i--) {
			int sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)) + mod;
			switch (sum) {
				case 0:
					resultOfAdd = 0;
					mod = 0;
					break;
				case 1:
					resultOfAdd = 1;
					mod = 0;
					break;
				case 2:
					resultOfAdd = 0;
					mod = 1;
					break;
				case 3:
					resultOfAdd = 1;
					mod = 1;
					break;
			}
			String digit = Integer.toString(resultOfAdd);
			sumOfNumbers = digit.concat(sumOfNumbers);
		}
		if (mod == 1) {
			String digit = Integer.toString(mod);
			sumOfNumbers = digit.concat(sumOfNumbers);
		}
		else {
			sumOfNumbers = ' ' + sumOfNumbers;
		}
		System.out.println("Спасибо, что обратились в 'Братья Цыплята'!");
		System.out.println(" " + num1);
		System.out.println("+");
		System.out.println(" " + num2);
		for (int i = 0; i < sumOfNumbers.length(); i++) {
			System.out.print("_");
		}	
		System.out.println();
		System.out.println(sumOfNumbers);
	}
}
