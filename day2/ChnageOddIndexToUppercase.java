package week1.day2;

public class ChnageOddIndexToUppercase {

	public static void main(String[] args) {
		String str="changeme";
		char[] ch=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i%2!=0) {
			char Uch=Character.toUpperCase(ch[i]);
			System.out.print(Uch);
			}else
			{
				System.out.print(ch[i]);
			}
			

	}

}}
