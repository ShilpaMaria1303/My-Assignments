package Week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreesetSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<=data.length-1;i++)
		{
			set.add(data[i]);
		}
		List<Integer> finallist=new ArrayList<>(set);
		Collections.sort(finallist);
		System.out.println(finallist);
		System.out.println("Second Largest=:  "+ finallist.get((4)));
		
	}}
	