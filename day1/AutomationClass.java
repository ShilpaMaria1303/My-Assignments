package Week3.day1;

public class AutomationClass implements Language,TestTool{

	public static void main(String[] args) {
		
		AutomationClass ac=new AutomationClass();
		ac.java();
		ac.python();
		ac.ruby();
		ac.Selenium();
	}

	public void Selenium() {
System.out.println("selenium");		
	}

	public void java() {
		System.out.println("Java");		
		
	}
	public void python() {
		System.out.println("python--Multiplelanguageclass");
	}
	public  void ruby() {
		System.out.println("ruby--Multiplelanguageclass");

	}

	public void java1() {
		System.out.println("java1--Multiplelanguageclass");
	}
	
}
