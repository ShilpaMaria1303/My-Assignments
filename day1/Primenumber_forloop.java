package week1.day1;

public class Primenumber_forloop {

	public static void main(String[] args) {
		int num=4;
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0)
			{
				count++;
			}}
			if(count==2) {
				System.out.println("Number is prime");}	
			else
			{
				System.out.println(" Number is not prime");
			}
		}
}


