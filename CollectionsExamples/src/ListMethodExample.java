import java.util.ArrayList;
import java.util.List;

public class ListMethodExample {
	public static void main(String[] args) {
		List<Integer> arrayListObj1 = new ArrayList<>();
		arrayListObj1.add(50); // add
		arrayListObj1.add(60);
		arrayListObj1.add(70);
		arrayListObj1.add(80);
		System.out.println("" + arrayListObj1);
		List<Integer> arrayListObj2 = new ArrayList<>();
		arrayListObj2.add(10);
		arrayListObj2.add(20);
		arrayListObj2.add(30);
		arrayListObj2.add(40);
		arrayListObj2.add(10);
		System.out.println("" + arrayListObj2);
		arrayListObj1.addAll(3, arrayListObj2); // add all
		System.out.println("" + arrayListObj1);
		boolean value = arrayListObj2.remove(new Integer(60)); //removing the direct value in the list by providing the value_name as the parameter.
		System.out.println("" + arrayListObj2);
		System.out.println("" + value);
		int value1 = arrayListObj2.remove(2); // remove- removing the value in the list using the index (2-is the index of 30 )
		System.out.println("" + value1); //30 is printed as output. 
		System.out.println("" + arrayListObj2);
		int value2 = arrayListObj2.set(1, 70); // set-setting/replacing teh value of a specific field in the list by passing the (index,value) as parameters . 
		System.out.println("" + arrayListObj2);//above method replaces 20 with 70 . 
		System.out.println("the value that is replaced is" + value2);// the value that is replaced is 20.
		int valueRetreived=arrayListObj2.indexOf(new Integer(70)); // indexof method is used to know the index of a specific value in the list.
		System.out.println("the index of value 70 in the list is ="+valueRetreived);
		int valueRetreived1=arrayListObj2.lastIndexOf(new Integer(10)); // lastindexof method is used to know the lastindex of a specific value in the list.
		System.out.println("the index of value 70 in the list is ="+valueRetreived1);
		/*ListIterator<Integer> litr=null;
		litr=arrayListObj2.listIterator();
		System.out.println("result of listiterator method "+litr);*/
		
		
	}

}
