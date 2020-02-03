package weekday1.day1;

public class MyMobile {

	

		// Syntax to create method : AccessSpecifier Returntype MethodName{}

		public long phnumber() {

			//System.out.println("Apple");
			return 7010309781l;

		}

		public int dimensions() {
			return 5;

			//System.out.println("Black");
		}

		public short camera() {

			//System.out.println("Click Picture");
			return 20;
		}
		
		public static void main(String[] args) {
			
			MyMobile phn = new MyMobile();
			
			System.out.println(phn.camera());
			System.out.println(phn.phnumber());
			System.out.println(phn.dimensions());
			
			Mobile dd = new Mobile();
			dd.brandName();
			dd.camera();
			dd.mobileColour();
			
		}
		
		

}
