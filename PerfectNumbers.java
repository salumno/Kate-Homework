//Печать всех совершенных чисел до 10000
public class PerfectNumbers {
	public static void main (String[] args) {
		for (int i = 1; i <= 10000; i++) {
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
			if (i == sum - i) {
			System.out.println(i);
			}
		}
	}
}
