package Week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("deposit-AxisBank");
	}

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();

	}

}
