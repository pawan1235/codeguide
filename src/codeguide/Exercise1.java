package codeguide;

public class Exercise1 {

	public static void main(String[] args) {
		double[] a = { 3.14, 1.59, 0.543, 5.55 };
		double[] b = { 6.17, 1.23, 3.579, 4.13 };

		double sum_a = 1;
		// find multiplied result and print result of a
		for (int i = 0; i < a.length; i++) {
			sum_a = sum_a * a[i];
		}
		System.out.printf("Result of a is: %.2f\n", sum_a);

		double sum_b = 1;
		// find multiplied result and print result of b
		for (int i = 0; i < b.length; i++) {
			sum_b = sum_b * b[i];
		}
		System.out.printf("Result of b is: %.2f", sum_b);

		// TODO Instead of writing too many for loop writing a method to find a
		// multipiled result of any double array so we can avoid writing
		// duplicate code. Delete all of loop and replace it with your method.
	}

	public static int FindMutiplie(double[] array) {
		// TODO write a method to find a multipiled result and return its
		// result.
		return 0;
	}
}
