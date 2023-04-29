package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
     int firstnum=0;
     int secnum=1;
     int sum=0;
     for(int i=1;i<=11;i++) {
    	 sum=firstnum+secnum;
    	 firstnum=secnum;
    	 secnum=sum;
    	 System.out.println(sum);
     }
     
	}

}
