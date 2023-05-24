
package JavaStandard11;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(0));
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		
		
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		list2.add("B");
		System.out.println(list2);
	}

}
