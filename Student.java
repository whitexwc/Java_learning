package Student;

public class Student {
	String name;
	String num;
	char sex;
	public void study(){
		System.out.print(name+"在学习");
	}
	public static void main(String [] args){
		Student s=new Student();
		s.name="梁战士";
		s.study();	
	}

}
