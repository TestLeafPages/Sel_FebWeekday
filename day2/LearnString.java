package weekday.day2;

public class LearnString {

	public static void main(String[] args) {

		// one way of Declaring a String
		String str = "Naveen";
		System.out.println(str);

		// Another way of Declaring a String

		String str1 = new String("Hari");
		System.out.println(str1);

		// to check the length of the string , shortcut to store a value in a variable
		// is ctrl,2+L
		int lengthofName1 = str.length();
		System.out.println(lengthofName1);

		int l= str1.length();
		System.out.println(l);

		// Converting given string to UpperCase

		System.out.println(str.toUpperCase());
		
		String ll = str1.toUpperCase();
		System.out.println(ll);
		
		// Converting given string to LowerCase
		
		String str2 = "DHIVYA";
		String str3 = "MITHRA";
		
		String dd = str2.toLowerCase();
		System.out.println(dd);
		
		String ff = str3.toLowerCase();
		System.out.println(ff);
		
		// Comparing a String using equals
		
		String text1 = "Testleaf Software Solutions";
		String text2 = new String("Testleaf Software Solutions");
		
		if (text1.equals(text2)) {
			
			System.out.println("Strings are Matching");
			
		}
		
		else {
			
			System.out.println("String does not match");
		}
		
		// Comparing a String using equalsIgnoreCase
		
		String txt1 = "TestLeaf Private Software Solutions";
		String txt2 = "testleaf private software solutions";
		
		if (txt1.equalsIgnoreCase(txt2)) {
			
			System.out.println("String Matches");
			
		}
		
		else {
			System.out.println("String does not match");
		}
		
		//  String using contains
		
		String text3 = "Testleaf Software";
//		String text4 = new String("Testleaf Software Solutions");
		if (text3.contains("Solutions")) {
			
			System.out.println("String are Same");
			
		}
		
		//Example 2 
		String txt= "Testleaf";
		String txt0= "Software";
		if (txt.contains(txt0)) {
			System.out.println("String MAtched");
		}
		else {
			System.out.println("String does not match");
		}
		
		
		// concat a String
		
		String a = "Naveen";
		String b = "Elumalai";
		String sb = a.concat(b);
		System.out.println(sb);
		
		
		// Learn tocharArray to print each char
		
		String c = "TestLeaf";
		char[] ddd = c.toCharArray();
		for (char eachChar : ddd) {
			
			System.out.println(eachChar);
			
		}
		
		
		
		//Trim spaces in a string  either at the Start or at the end of a String
		
		String str4 = new String("        TestLeaf Private Software Solutions");
		String ss = str4.trim();
		System.out.println(ss);
		
		
		
		// Learn Replace in a String 
		
		String d = "NAveen";
		String replace = d.replace('A', 'a');
		System.err.println(replace);
		
		
		// Learn ReplaceAll in a String (regex is used to print only the numbers)
		
		String e = "Naveen26061997Elumalai";
		String replaceAll = e.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
