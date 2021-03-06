package string;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String str1=sc.nextLine();
		
		str1=str1.replaceAll("[^aeiouAEIOU]","");
		
		System.out.println("Vowel Count: " +str1.length());
	}

}
