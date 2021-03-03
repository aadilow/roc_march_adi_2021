
public class Question4 {

	public static void main(String[] args) {
		//Find the sum of all even numbers between 1 and 100
		//Find the sum of all odd numbers and print the results
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<=100;i+=2) //even sum
		{
			evensum+=i;
		}
		System.out.println("Even Sum= "+evensum);
		
		for(int i=1;i<=100;i+=2) //odd sum
		{
			oddsum+=i;
		}
		System.out.println("Odd Sum= " +oddsum);
		
		//print greater sum
		if(oddsum>evensum) {
			System.out.println("Odd Sum is greater with Value: " +oddsum);
		}
		else if(evensum<oddsum)
		{
			System.out.println("Even Sum is greater with Value: "+evensum);
		}
		else //equal case
		{
			System.out.println("They are equal");
		}
	}

}
