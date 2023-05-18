package Week3.day1;

public class StudentsOverloading {
	public void getStudentInfo(int id)
	{
		System.out.println("ID is " +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("ID is " +id +" , " +  "Name is "+name);
	}
	public void getStudentInfo(int id,String name,String email)
	{
		System.out.println("ID is " +id +" , " +  "Name is "+name + "," +"Email is "+email);
	}
	public static void main(String[] args) {
		StudentsOverloading so=new StudentsOverloading();
		so.getStudentInfo(1);
		so.getStudentInfo(1, "Shilpa");
		so.getStudentInfo(1, "Shilpa", "shilpa@gmail.com");

	}

}
