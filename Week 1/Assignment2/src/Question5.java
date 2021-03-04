import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Take an array input and find the 2nd max value in that array
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" numbers");
		
		int ar[]=new int[n];
	
		
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			
		}
		int max2=ar.length-2;
		Arrays.sort(ar);
		System.out.println("2nd Max: " +ar[max2]);
	}

}
