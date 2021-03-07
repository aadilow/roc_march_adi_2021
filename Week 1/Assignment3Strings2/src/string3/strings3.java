package string3;

import java.util.Arrays;

public class strings3 {
	public static void main(String[] args) {
		String str1 = "The quick brown fox ate my homework :(";
		//str1 ="dog ate cat boy did cry";
		
		String[] x = str1.split(" ");
		
		int z[]= new int[x.length];
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < x.length; i++) { //for every word
			z[i]= x[i].length();//store each word size
		}
		Arrays.sort(z);
		int MaxWordLength=z[z.length-1]; 
		int MinWordLength=z[0];
		
		for (int i = 0; i < x.length; i++) { //for every word
			if(x[i].length()==MaxWordLength) {
				System.out.println("Max Word: " +x[i]);
			}
			if(x[i].length()==MinWordLength){
				System.out.println("Min Word: " +x[i]);
			}
		} 
		
	}
}
