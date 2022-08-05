import java.util.*;

class showDetails{  
    public static void main(String args[]){  
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  s2.display();  
    }
}

class Student{  
	int rollno;  
	String name;  
	float fee;  
	Student(){ 
		System.out.println("Default");
}  
	Student(int rn,String name,float fee){ 
		this(); 
		rollno=rn;  
		name=name;  
		this.fee=fee;  
}  
void display(){
    System.out.println(rollno + " " + name + " " + fee);
    }  
}  

