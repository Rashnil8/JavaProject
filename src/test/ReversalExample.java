package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Liril";
		String result = "";
		for(int i=str1.length()-1;i>=0;i--) {
			result = result+str1.charAt(i);
		}
		System.out.println("Revered string is " +result);
		
		if(str1.equalsIgnoreCase(result)) {
			System.out.println("The given sting is palindrom");
		}else {
			System.out.println("The given sring is Not palindrom");
		}
		
		//**********************split eg.
		String str2 = "David meets John";
		String[] arr = str2.split(" ");
		String result1 = "";
		for(int i = arr.length-1;i>=0;i--) {
			result1= result1+arr[i]+" ";
			
		}
		System.out.println("The result is " + result1);
			

	}

}
