package test;

public class CondiitionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 2;
		
		if(age<17) {
			System.out.println("You are not eligiable for votiing");
		}else if(age == 17) {
			System.out.println("You will be eligiable for voting next year");
		}else {
			System.out.println("You are eligiable for voting");
		}

	}

}
