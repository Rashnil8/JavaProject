package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Rashnil","Janhavi","Chaitanya","Swara"};
		System.out.println("The second name in array is " + names[1]);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Swara");
		list1.add("Janhavi");
		list1.add("Chaitanya");
		list1.add("Rashnil");
		list1.add("Rashnil"); //duplicate also accept here
		
		
		System.out.println("The list is " + list1);
		System.out.println("The size of the list is " + list1.size());
		System.out.println("First name in the list " + list1.get(0));
		System.out.println("First name in the list " + list1.get(list1.size()-1));
		
		list1.set(1, "John"); //to update the data at index
		System.out.println("The list is after updating Janhavi " + list1);
		
		list1.remove(2); //to remove the data from list at index
		System.out.println("The list is after deleting Chaitanya " + list1);
		
		//Iterate through the list
		
		for(int i=0;i<list1.size();i++) {
			System.out.println("Element name " + list1.get(i));
		}
		
		for(String value:list1) {
			System.out.println("Element value " + value);
		}
		Iterator<String> itr = list1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list1);
		System.out.println("After sorting the list " + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order " + list1);


	}

}
