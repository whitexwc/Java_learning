package Student;

public class Student {
	String name;
	String num;
	char sex;
	public void study(){
		System.out.print(name+"��ѧϰ");
	}
	public static void main(String [] args){
		Student s=new Student();
		s.name="��սʿ";
		s.study();	
	}

}
