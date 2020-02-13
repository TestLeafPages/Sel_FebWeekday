package weekday.day2;

import java.util.Arrays;

public class LearnArray {
	
	public static void main(String[]args) {
		
		/*
		 * int[] b = new int[10];// an empty array with size 10 int [] a =
		 * {1,3,5,7,8,2,4,6,10}; // values are stored in array
		 * 
		 * Arrays.sort(a); for (int listofArray : a) {
		 * 
		 * System.out.println(listofArray);
		 * 
		 * }
		 */
		
		
		
		float[] f = {123.2345f, 12345.123f, 12354.12345f, 895.21f};
		Arrays.sort(f);
		for (float valueOfFloat : f) {
			
			System.err.println(valueOfFloat);
			
		}
		
		
		
		  String[] participants = {"Naveen", "Priya", "Sowmiya", "Sowmiya" , "Mithra" ,
		  "Maheshwari", "Kavitha","Dhivya","Abinaya","Ameer","Anoop","Mahalakshmi","Nisha","Pavan","Rajsharmila","Pushp"};
		  
		  // to know the length or size of the String
		 int lengthOfString = participants.length;
		 System.out.println(lengthOfString);
		 
		 Arrays.sort(participants);
		 
		 for (String names : participants) {
			 
			 System.out.println(names);
			
		}
		
		
		
		
		
	}

}
