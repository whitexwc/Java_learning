
public class TestDatatype {
	public static void main(String[] args){
		int a=97;
		char b=(char)a;
		float c=0.1f;
		double d=1.0/10;
		boolean e=(c==d);
		String f=Integer.toBinaryString(a);
		System.out.println(f);//输出整型装换为二进制结果
		System.out.println(b);//输出强制类型转换结果
		System.out.println(e);//输出浮点数表示小数有舍入误差	
	}
}

