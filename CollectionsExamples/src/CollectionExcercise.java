import java.util.TreeSet;

public class CollectionExcercise {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(10);
		treeSet1.add(20);
		treeSet1.add(30);
		treeSet1.add(40);
		TreeSet<Integer> treeSet2 = new TreeSet<>();
		treeSet2.add(10);
		treeSet2.add(40);
		treeSet1.addAll(treeSet2);
		System.out.println("" + treeSet1 + " " + treeSet2);
		treeSet2.addAll(treeSet1);
		System.out.println("" + treeSet1 + " " + treeSet2);

		Object[] array = treeSet1.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println("" + (int) array[i]);
		}
		System.out.println("new line added");
		System.out.println("second line added");
	}
}
