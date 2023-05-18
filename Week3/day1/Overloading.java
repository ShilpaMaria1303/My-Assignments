package Week3.day1;

public class Overloading {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		
	}
	public void mul(double num1,double num2) {
		System.out.println(num1*num2);
		
	}
	public void mul(float num1,float num2,float num3) {
		System.out.println(num1*num2*num3);
		
	}


	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.add(2, 3);
		obj.add(4, 5, 6);
		obj.mul(2.5, 2.5);
		obj.mul(1.1f, 1.1f, 1.1f);
		
	}

}
