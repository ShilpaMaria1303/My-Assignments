package Week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("student name-student class");
	}
	public void studentDept() {
		System.out.println("student dept-student class");
	}
	public void studentid() {
		System.out.println("student ID-student class");
	}
	
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentid();
		st.studentName();
	}

}
