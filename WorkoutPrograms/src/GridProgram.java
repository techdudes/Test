
public class GridProgram {
	public static void main(String[] args) {
		String[][] gridArray = new String[10][10];
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {
				gridArray[row][column] = "- ";
				System.out.print(gridArray[row][column]);
			}
			System.out.println();
		}
	}
}
