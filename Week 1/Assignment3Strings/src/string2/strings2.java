package string2;

import java.util.Scanner;

public class strings2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str1 = sc.nextLine();

		str1 = str1.replaceAll("[^aeiouAEIOU]", "").toLowerCase();
		System.out.println("Current Vowels: " +str1);
		int check=0,f1=0,f2=0,f3=0,f4=0,f5=0;
		
		if (str1.length() < 5) { //saves 4 loops
			System.out.println("Not all vowels present");
			
		} else {
			
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == 'a' && f1 <1) {
					check++;
					f1=1;
				}
				if (str1.charAt(i) == 'e' && f2 <1) {
					check++;
					f2=1;
				}
				if (str1.charAt(i) == 'i'&& f3 <1) {
					check++;
					f3=1;
				}
				if (str1.charAt(i) == 'o'&& f4 <1) {
					check++;
					f4=1;
				}
				if (str1.charAt(i) == 'u'&& f5 <1) {
					check++;
					f5=1;
				}
				
			}
			if(check==5) System.out.println("All vowels present");
			else System.out.println("Not all vowels present");
		}
		

	}

}
