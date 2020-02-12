package week2.day2;

public class ImplementInterface implements LearnInterface{

	public void method1() {
		System.out.println("Hi there, I got implemented");
	}
	
	public static void main(String[] args) {
		
		ImplementInterface obj = new ImplementInterface();
		obj.method1();
//		Scope restriction 
		LearnInterface learn = new ImplementInterface();
//		learn.
//		LearnInterface learn = new LearnInterface();
		
		
	}

	public void addAccount(int acNum) {
		// TODO Auto-generated method stub
		
	}

	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void withdra1() {
		// TODO Auto-generated method stub
		
	}
	

}
