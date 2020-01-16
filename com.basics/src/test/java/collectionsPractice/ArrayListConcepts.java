package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcepts {

	public static void main(String[] args) {

		Employee e1 = new Employee("Naveen1", "glnaveen06@gmail.com", 10);
		Employee e2 = new Employee("Naveen2", "glnaveen07@gmail.com", 20);
		Employee e3 = new Employee("Naveen3", "glnaveen08@gmail.com", 30);
		Employee e4 = new Employee("Naveen4", "glnaveen09@gmail.com", 40);

		ArrayList<Employee> lst = new ArrayList<Employee>(Arrays.asList(e1, e2, e3, e4));

		for (int i = 0; i < lst.size(); i++) {
			if (lst.get(i).getName().equalsIgnoreCase("Naveen1")) {
				lst.get(i).setDeptno(140);
			}
			System.out.println(lst.get(i));
		}

		System.out.println("-----------------");
		System.out.println(lst.get(0));
		
		
		// Converting ArrayList Objects to Arrays
		
		Object[] array = lst.toArray();
		
		for(int i =0;i<array.length;i++) {
			System.out.println("--- retriving from array Objects--------");
			System.out.println(array[i]);
		}

	}

}
