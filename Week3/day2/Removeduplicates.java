package Week3.day2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Removeduplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split= text.split(" ");
		String s1=" ";
		Set<String> unique=new TreeSet<>();
		for(int i=0;i<=split.length-1;i++)
		{
		Boolean add=	unique.add(split[i]);
		
		if(add) {
			s1=s1+unique;
			
		}}
		System.out.println(s1);
		}}
		
	


