import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//Take an array input and find all the prime numbers from it.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" numbers");
		
		int ar[]=new int[n];
		
		//prime 1 2 3 5 7 11 13 17 19 23 29
		
		
		//and check if sqrt is a whole int
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			//If square root of x has a remainder, that number is prime
			//if x==0, neither prime or composite
			//if both x/2 and x/3 has a remainder, the number is prime
			//if x=1,2,3 this logic doesn't apply, so hardcase logic for those primes
			
			double sq1=Math.sqrt(ar[i]);
			
			//check if there is a remainder
			double check1=sq1-Math.floor(sq1); 
			double check2=Math.round(sq1)-sq1;
			int check3=ar[i]%2;
			int check4=ar[i]%3;
			
			if(ar[i]==0) {
				System.out.println("0 is not prime or composite");
			}
			
			else if(ar[i]>0 && ar[i]<=3) {
				System.out.println(ar[i] +" is a prime number" );
				//can store value to a new array if desired 
			}
			else if((check1>0 || check2>0) && (check3>0 && check4>0)) { //there is a remainder so it is prime
				System.out.println(ar[i] +" is a prime number");
				//can store value to a new array if desired
			}
			else {
				System.out.println(ar[i] +" is not a prime number");
			}
			
		}
		
	}

}
