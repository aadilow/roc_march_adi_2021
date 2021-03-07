import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Take an array input and find all the palindrome numbers from it.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many inputs");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " numbers");

		int ar[] = new int[n];
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
			s[i] = Integer.toString(ar[i]);

			StringBuffer sb = new StringBuffer(s[i]);
			sb.reverse();
			String temp = sb.toString();
			if (s[i].equals(temp)) {
				System.out.println(s[i] + " is Palindrome");
			} else {
				System.out.println(s[i] + " is not a Palindrome");
			}
		}
	}
}
