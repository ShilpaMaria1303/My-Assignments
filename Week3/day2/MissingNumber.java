package Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
int[] data = {3,2,10,4,6,7,2,3,3,6,7,1,8,9}; // You can see number which is 1 to 10 find the missing no
		
		//Set will never allow the duplicate value
		Set<Integer> h = new LinkedHashSet<Integer>();
		
		//Using Foreach loop to iterate the data
		for(int i : data) {
			System.out.println("List Values are: "+i);
			
			//Adding the data value into set
			h.add(i);
		}
		
		// Now duplicate value are removed 
		System.out.println("Set Values are: "+h);
		
		
		//Now i m using ArrayList because then only i can able to sort the value
		ArrayList arrayList = new ArrayList(h);

		// sorting the list
		Collections.sort(arrayList);

		
		//Anwser will be 1,2,3,4,6,7,8,9,10 now 5 is missing we have to print 5 as missing val
		System.out.println("Ascending Order in List: "+arrayList);
		
		//iterate using arraylist value by the help of i value
		for(int i =1; i<= arrayList.size(); i++) {
			
			//arrayList.size - 9 {1,2,3,4,6,7,8,9,10
			// int i val start at 1,2,3,4,5,6,7,8,9
			
			
			//Now 5 is not at arraylist but in i val 
			
			
			
			// if not arraylist.contaains(i)5
			if(!arrayList.contains(i)) {
				
				//Now print the missing val
				System.out.println("Missing value is: "+i);
			}
		}
	}
	}

}
