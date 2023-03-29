package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Rashnil is from the Malegaon";
		String name1 = "Swapnil";
		String name2 = "Ramesh";
		//spaces is also count in characters
		System.out.println("Num of chars in string is " + name.length());
		
		System.out.println("The 4th char in the string is " + name.charAt(6));
		System.out.println("The last char name the string is " + name.charAt(name.length()-1));
		System.out.println("The 2nd char name the string is " + name.charAt(2));
		
		System.out.println("The string in upper case is " + name.toUpperCase());
		System.out.println("The string in lower case is " + name1.toLowerCase());
		System.out.println("Num of chars in string is " + name2.length());
	}

}
