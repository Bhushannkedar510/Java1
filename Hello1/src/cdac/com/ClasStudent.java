package cdac.com;



class Student{
	int studentId;
	String name;
	int marks;
}

public class ClasStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.studentId=101;
		s1.name="Arun";
		s1.marks=85;
		
		s2.studentId=102;
		s2.name="Priya";
		s2.marks=92;
		
		s3.studentId=103;
		s3.name="Rahul";
		s3.marks=78;
		
		System.out.println(s1.studentId+" "+s1.name+" "+s1.marks);
		System.out.println(s2.studentId+" "+s2.name+" "+s2.marks);
		System.out.println(s3.studentId+" "+s3.name+" "+s3.marks);
	}
	

}
