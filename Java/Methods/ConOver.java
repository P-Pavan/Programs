public class ConOver {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("virat","2018CCE0001","CCE");
		Student s3=new Student(s2);
		s1.disp();
		s2.disp();
		s3.disp();
	}
}

class Student
{
	String name, rollno, branch;
	Student()
	{
		name = "sachin";
		rollno = "20181CSE0001";
		branch = "CSE";
	}
	Student(String name, String rollno, String branch)
	{
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
	}
	Student(Student s)
	{
		this.name=s.name;
		this.rollno=s.rollno;
		this.branch=s.branch;
	}
	void disp()
	{
		System.out.println("name:"+name+"\nrollno:"+rollno+"\nbranch:"+branch);
	}
}

