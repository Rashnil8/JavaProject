package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<11;num++) {
			System.out.println(num);
		}
		System.out.println("***For loop now ended***");
		System.out.println("#################################");
		
		//Return loop example
		
		for(int num1=10;num1>0;num1--) {
			System.out.println(num1);
		}
		
			System.out.println("*****Down to Up*****");
			System.out.println("##################################");
			
			//Table loop eg.
			
			for(int num=2;num<11;num+=2) {
				System.out.println(num);
			}
			System.out.println("********For 2 Table loop ended*********");
			System.out.println("################################");
			
			int[] arr1 = {2,3,4,6,8,9};
			for(int i=0;i<arr1.length; i++) {
				System.out.println("Element value is " +arr1[i]);
			}
			//for each loop
			for(int val:arr1) {
				System.out.println("Value is " +val);
			}
			String str1 = "Swapnil";
			for(int i=0;i<str1.length();i++) {
				System.out.println("Char value is " + str1.charAt(i));
			}


	}

}
