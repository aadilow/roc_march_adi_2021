
public class Question2 {

	public static void main(String[] args) {
		//print all palindrome numbers btwn 100 and 999
		///example 202,212,222,232,242,252,262,272,282,292, etc
		 //x-202<90, 292-202=90     202-202=0
		
		//It is palinedrome if (x-202)/10 has no remainder, 
		//since x-202 equals 0,10,20,30,40,50,60,70,80,90
		
		//so in all cases x-101*[1,2,3,4,5,6,7,8,9]/10 has to have a remainder of 0
		
		for (int x=1;x<=9;x++)
		{
				int start=x*100; //adds 100 to range of 100-199 each loop
				int end=(x*100)+99;
			
			for(int i=start;i<=end; i++) {
			
				int check=i-101*x; //checks if in range between 0 and 90
			
				if(check%10==0)//if no remainder from division by 10 then it's a palindrome
				{
					System.out.println("Value: " +i); //prints i at palindrome values
				}
			}
		}
		System.out.println("End of Progarm");
	}

}
//202 2002