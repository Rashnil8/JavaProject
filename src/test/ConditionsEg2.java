package test;

import java.util.Scanner;

public class ConditionsEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Age");
		
		age = scanner.nextInt();
		
		if(age<17) {
			System.out.println("You are not eligiable for voting");
		}else if(age == 17) {
			System.out.println("U r eligiable for next Year");
		}else {
			
			System.out.println("You are eligiable for voting");
		}
		
		scanner.close();

	}

}
