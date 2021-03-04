import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Take an array input and find the sum of all even numbers.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" numbers");
		
		int ar[]=new int[n];
		int arsum=0;
		
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			
			int check=ar[i]%2; //is even?
			
			if(check==0) { //if even add up
				arsum+=ar[i];
			}
		}
		System.out.println("The sum is " +arsum);
	}

}
