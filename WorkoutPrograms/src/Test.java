public class Test {

	public static int findArrayIndex(int[] my_array, int t) {

		int index = 0;
		for (int i = 0; i < my_array.length; i++) {

			if (my_array[i] == t) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

		System.out.println("Index position of 25 is: " + findArrayIndex(my_array, 25));

		System.out.println("Index position of 77 is: " + findArrayIndex(my_array, 77));

		System.out.println("Index position of 78 is: " + findArrayIndex(my_array, 18));

	}

}