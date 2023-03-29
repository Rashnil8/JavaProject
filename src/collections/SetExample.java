package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Jay");
		set1.add("Laxmi");
		set1.add("Nayara");
		set1.add("Nayara"); //duplicate not accept here
		
		System.out.println("The set is " + set1);
		
		//Sorted set
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("Zen");
		set2.add("Julliy");
		set2.add("Kashu");
		
		System.out.println(set2);
		
		//Convert set to list
		ArrayList<String> list1 = new ArrayList<String>(set1);
		
		System.out.println(list1);

	}

}
