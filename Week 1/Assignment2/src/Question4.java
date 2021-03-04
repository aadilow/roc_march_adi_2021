import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Take an array input and find the max value and min value from that array.
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter "+n +" numbers");
		
		int ar[]=new int[n];
		int maxv=0;
		int minv=0;
		//need temp since using one for-loop means min and max will always be
		//last two compared values
		int temp=0; 
		// 1 2 3 4 5
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
			if(i==0) { //first comparison is against first indexed value and itself
			temp=ar[i]; 
			}
			
			//find max
			if(i>=1) { //store max value to compare against other indexed values
			temp=maxv;
			}
			
			if(ar[i]>=temp) { //if current value is greater than temp, reassign max
				maxv=ar[i];
			}
			else { //if current value is less than temp, keep max as temp
				maxv=temp;
			}
			
			//find min
			if(i>=1) {
				temp=minv;
				}
			if(ar[i]<=temp) {
				minv=ar[i];
			}
			else {
				minv=temp;
				}
			
		
		}
		System.out.println("Max: " +maxv +" Min: " +minv);
	}
}
