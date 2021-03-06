package string3;

import java.util.Scanner;

public class strings3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str1 = sc.nextLine();
		System.out.println("Original: " +str1);
		System.out.println("Length: " +str1.length());

		for (int i = 0; i < str1.length(); i++) {
			int prime = isPrime(i);

			if (prime > 0) {

				System.out.println("Index: " +i+ " " + "Char: " +str1.toUpperCase().charAt(i));

			} else {
			}
		}
		
	}

	private static int isPrime(int i) {
		double sq1 = Math.sqrt(i);

		// check if there is a remainder
		double check1 = sq1 - Math.floor(sq1);
		double check2 = Math.round(sq1) - sq1;
		int check3 = i % 2;
		int check4 = i % 3;

		if (i == 0) {
		}

		else if (i > 0 && i <= 3) {// is prime

			return i;

		} else if ((check1 > 0 || check2 > 0) && (check3 > 0 && check4 > 0)) { // there is a remainder so it is prime

			return i;
		} else {
			return 0;
		}

		return 0;
	}
}
