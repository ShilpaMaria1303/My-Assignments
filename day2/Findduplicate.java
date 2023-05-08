package week1.day2;

import java.util.Iterator;

public class Findduplicate {

	public static void main(String[] args) {
		int num[]= {2,5,3,2,5};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j])
				{
					System.out.println(num[i]);
				}
				
			}
		}
		

	}

}
