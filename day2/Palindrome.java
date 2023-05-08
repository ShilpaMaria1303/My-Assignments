package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		String s="madams";
		String s1="";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
		s1=s1+ch[i];	
		}
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		

	}

}
