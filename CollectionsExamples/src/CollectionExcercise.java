import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionExcercise {
	public static void main(String[] args) {
		SortedSet<Integer> treeobj = new TreeSet<>();
		treeobj.add(20);
		treeobj.add(40);
		treeobj.add(30);
		treeobj.add(10);
		treeobj.add(10);
		System.out.println("add" + treeobj);
		TreeSet<Integer> treeobj1 = new TreeSet<>();
		treeobj1.add(50);
		treeobj1.add(60);
		treeobj1.add(70);
		treeobj1.add(80);
		TreeSet<Integer> treeobj2 = new TreeSet<>();
		treeobj2.add(30);
		treeobj2.add(40);
		treeobj2.add(50);
		treeobj2.add(60); // add
		System.out.println("add" + treeobj1);
		treeobj.addAll(treeobj1); // addall
		System.out.println("add all" + treeobj);
		treeobj.remove(10);// remove
		System.out.println("remove" + treeobj);
		treeobj1.removeAll(treeobj);// removeall
		System.out.println("removeall" + treeobj1);
		treeobj.retainAll(treeobj2); // retainall
		System.out.println("retain all" + treeobj);
		System.out.println("size-" + treeobj.size());// size
		System.out.println("contains 80-" + treeobj.contains(80));
		System.out.println("contains all-" + treeobj.containsAll(treeobj2));
		System.out.println("" + treeobj.iterator());
		System.out.println("is it empty" + treeobj.isEmpty());
		System.out.println("equals? " + treeobj.equals(treeobj1));
		System.out.println("hashcode? " + treeobj.hashCode());
		Object[] Array = treeobj.toArray();
		System.out.println("" + Array);
		treeobj.clear();
		System.out.println("" + treeobj);
		List<Integer> arrayListObj = new ArrayList<>();
		arrayListObj.add(50);
		arrayListObj.add(60);
		arrayListObj.add(70);
		arrayListObj.add(80);
		System.out.println("" + arrayListObj);
		ArrayList<Integer> arrayListObj2 = new ArrayList<>();
		arrayListObj2.add(10);
		arrayListObj2.add(20);
		arrayListObj2.add(30);
		arrayListObj2.add(40);
		arrayListObj2.add(10);
		System.out.println("" + arrayListObj2);
		arrayListObj.addAll(3, arrayListObj2);
		System.out.println("" + arrayListObj);
		boolean value = arrayListObj2.remove(new Integer(10));
		System.out.println("" + arrayListObj2);
		System.out.println("" + value);
		int value1 = arrayListObj2.remove(2);
		System.out.println("" + value1);
		System.out.println("" + arrayListObj2);
		int value2 = arrayListObj2.set(1, 70);
		System.out.println("" + arrayListObj2);
		System.out.println("" + value2);
	}
}
