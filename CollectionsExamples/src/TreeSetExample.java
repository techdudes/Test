import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeSetObject = new TreeSet<>();
		treeSetObject.add(20);
		treeSetObject.add(10);
		treeSetObject.add(40);
		treeSetObject.add(30);
		//treeSetObject.getClass();

		System.out.println("" + treeSetObject);
		System.out.println("" + treeSetObject.getClass());

		TreeSet<String> treeSetObject1 = new TreeSet<>();
		treeSetObject1.add("a");
		treeSetObject1.add("c");
		treeSetObject1.add("b");
		treeSetObject1.add("f");
		treeSetObject1.add("d");
		System.out.println("" + treeSetObject1);
		System.out.println("" + treeSetObject1.getClass());

		// TreeSet<StringBuffer> treeSetObject2 = new TreeSet<>();
		// treeSetObject2.add(new StringBuffer("b"));
		// treeSetObject2.add(new StringBuffer("a"));
		// treeSetObject2.add(new StringBuffer("c"));
		// treeSetObject2.add(new StringBuffer("d"));
		// System.out.println(""+treeSetObject2);
		// System.out.println(""+treeSetObject2.getClass());
		//
		TreeMap<Integer, Integer> treeMapObject = new TreeMap<>();
		treeMapObject.put(20, 200);
		treeMapObject.put(30, 100);
		treeMapObject.put(10, 101);
		treeMapObject.put(10, 100);
		System.out.println("" + treeMapObject);

		Employee emp1 = new Employee();
		emp1.setEmpAge(10);
		emp1.setEmpName("ram");

		Employee emp2 = new Employee();
		emp2.setEmpAge(20);
		emp2.setEmpName("sam");

		Employee emp3 = new Employee();
		emp3.setEmpAge(30);
		emp3.setEmpName("rhiam");

		TreeSet<Employee> employeeObject = new TreeSet<>();
		employeeObject.add(emp1);
		employeeObject.add(emp3);
		employeeObject.add(emp2);
		for (Employee employee : employeeObject) {
			System.out.println(employee);
		}
	}
}
