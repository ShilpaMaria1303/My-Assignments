package Week3.day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Uniquecharinstring {

	public static void main(String[] args) {
		String s="babu";
		String s1="";
		char ch[]=s.toCharArray();
		Set<Character> Unique=new HashSet<>();
		Set<Character> Unique1=new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			Unique.add(ch[i]);
			 //characters.remove('B');
			char searchChar = 'b';
			if(Unique.contains(searchChar))
			{
				Unique.remove(searchChar);
				
				}
			//System.out.println(Unique);
			}
		System.out.println(Unique);
	}
}

