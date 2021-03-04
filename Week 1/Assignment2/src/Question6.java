
public class Question6 {

	public static void main(String[] args) {
		// Perform CRUD operations on Array Note:Use the Arrays util class effectively
		int ar[]=new int[6];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int ele=5; //inserted value
		int pos=5; //add to position 5, index 4
		
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];   //updating
		}
		ar[pos-1]=ele; //inserting 
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int delpos=4;//position 4 is index 3
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
