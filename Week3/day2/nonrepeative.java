package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class nonrepeative {

	public static void main(String[] args) {
		String s="babu";
		int count=0;
		char s1[]=s.toCharArray();
		
		Set<Character> unique=new HashSet<Character>();
		for(int i=0;i<=s1.length-1;i++)
		{
			unique.add(s1[i]);
			if (unique.contains(s1[i])) {
                unique.remove(s1[i]);
            } else {
            	System.out.println(unique);	
            }
		}}}
		
