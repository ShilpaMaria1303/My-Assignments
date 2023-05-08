package week1.day2;

import java.util.Iterator;

public class Reversestring {

	public static void main(String[] args) {
		String str="shilpa Maria ";
	String[] split	=str.split(" ");
		for(int i=0;i<=split.length-1;i++)
		{
			if(i%2!=0)
			{
		char[] ch=	split[i].toCharArray();
	String	rev=" ";
	
	for (int j = ch.length-1; j >=0; j--) {
		
		rev=rev+ch[j];
		
	}
	System.out.print(rev);
			}
	else
	{
		System.out.print(split[i]);
	}
			}
		}
		
	}


