//Печать всех простых чисел до 500
public class PrimeNumbers {
	public static void main (String[] args) {
		for (int i = 1; i <= 500; i++) {
			int sum = 0;
			int n = 1;
			double sqrt = Math.sqrt(i);
				while (n <= sqrt) {
					int mod = i % n;
					int div = i / n;
					if (mod == 0) {
						sum = sum + n;
						if (n != div) {
							sum = sum + div;
						}
					}
				n++;
				}
			if (sum == i + 1) {
			System.out.println(i);
			}
		}
	}
}
