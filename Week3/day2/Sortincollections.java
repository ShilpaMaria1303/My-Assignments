package Week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortincollections {

	public static void main(String[] args) {
		String s[]= {"HCL","Wipro","Aspire Systems","CTS"};
		int len=s.length;
		//System.out.println(len);
List<String> string=new ArrayList<>();
for(int i=0;i<=len-1;i++)
{
	string.add(s[i]);
}
Collections.sort(string);
//System.out.println(string);
int len1=string.size();
//System.out.println(len1);
List<String> reverse=new ArrayList<>();
for(int i=len1-1;i>=0;i--) {
	reverse.add(string.get(i));
}
System.out.println(reverse);
	}}
	