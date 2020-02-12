package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnList {
	
	public static void main(String[] args) {
//			Generic				Insertion Order
		List<String> li = new ArrayList<String>(); 
		li.add("Sam");
		li.add("Naveen");
		li.add("Hari");
		li.add("sam");
		
		Set<String> set = new HashSet<String>(li);
		
		for (String each : set) {
			System.out.println(each);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
