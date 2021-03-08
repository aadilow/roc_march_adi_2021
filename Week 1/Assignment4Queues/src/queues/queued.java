package queues;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Collections;

public class queued {

	public static void main(String[] args) {
		// linked list maintains index positions of elements
		// priority queues do not store elements based on

		List L = new LinkedList();
		String str = "turn in your homework";
		String str1 = "dog at my homework";
		String str2 = "cat ate my dog";
		String str3 = "turn in your cat";
		String str4 = "DOG DOG DOG";
		String str5 = "CAT";
		int x = 90909;

		L.add(str);
		L.add(str3);
		L.add(x);

		System.out.println(L);

		List<String> L2 = new LinkedList<>();

		L2.add(str1); // first value
		// L2.add(x); //Cannot add non String to this list

		int nullcount = 7; // add null 7 times

		for (int i = 0; i < nullcount; i++) {
			L2.add("fake null");
		}
		int targetpos = 4;

		// updates
		L2.set(targetpos, str3);
		L2.set(targetpos + 1, str4);
		L2.remove(7); // removes last value at index 7

		System.out.println("Linked List: " + L2);

		// queue
		PriorityQueue<String> pq = new PriorityQueue<String>(L2);
		
		System.out.println("CRUD on PQ");
		System.out.println("Original: " + pq);
		
		pq.remove(str3); // removes object not using index
		System.out.println("str3 removed " + pq);
		pq.add(str5);
		System.out.println("str5 added: " + pq);
		pq.add(str3);
		System.out.println("str3 added: " + pq);
		
		for (int i = 0; i <= 3; i++) {
			pq.remove("fake null");
			System.out.println("fake null removed: " + pq);
		} //all fake nulls removed
		
		//what happens if i try to remove something that doesn't exist?
		pq.remove("fake null");
		System.out.println("Nothing changed: " +pq);
		
		
	}

}
