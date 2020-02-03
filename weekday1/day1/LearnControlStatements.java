package weekday1.day1;

public class LearnControlStatements {

	public static void main(String[] args) {

		int a = 10;
		
		int i = 15;
		// Learn if statement

		// Example 1
		if (a != 10) {
			System.out.println("Value of a is:" + a);

		}

        //Example2

		if (a > 15) {

			System.out.println("True");

		}

		// Learn if else Statement
		
		// Example 1
		if (a > 20) {
			System.out.println("A is Larger");

		} else {
			System.out.println("A is smaller");
		}
		
		//Example2
		
		if (i>a) {
			System.out.println("Value of i is greater than a :"+" "+i);
			
		}
		else {
			
			System.out.println("Value of a is greater than i:"+" "+a);
		}
		
		// Learn if else Statement
		
		// Example 1
		 if (a<i) {
			 
			 if (a==i) {
				 
				 System.out.println("Value matches");
				
			}
			 else {
				System.out.println("Value does not match");
		}
			 
			
		}
		 else {
			System.out.println("a is greater than i");
		}
		 
		 // Learn For Statement
		
		//Example 1
		 for (int j = 0; j < 21; j++) {
			 System.out.println(j);
			
		}
		 
		// Learn switch Statement
		 
		 //Example 1
		 
		 int b = 3;
		 switch (b) {
		case 1 :
			System.err.println("Monday");
			break;
			
		case 2:
			System.err.println("Tuesday");
			break;
			
		case 3:
			System.err.println("Wednesday");
			break;
			
		case 4:
			System.err.println("Thursday");
			break;
			
		case 5:
			System.err.println("Friday");
			break;
			
		case 6:
			System.err.println("Saturday");
			break;
			
		case 7:
			System.err.println("Sunday");
			break;



		default:
			System.err.println("Invaliday");
			break;
		}
		 
		 
		 
		 
		 
		
			

	}

}
