import java.util.Scanner;
public class BL_1001 {
	public static void main(String []args){
		int i=0,n;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
			while(n!=1){
				if(n%2==0){
					n/=2;
				}
				else{
					n=(3*n+1)/2;
				}
				i++;
			}
		System.out.print(i);
	}

}
