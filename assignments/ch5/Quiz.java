public class Quiz {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j % 2 == 0)
					System.out.println(++count);
			}
		}
		int sum = 0;
		do {
			sum += 5;
		} while (sum < count);

		System.out.println("Sum is " + sum);
	}
}
