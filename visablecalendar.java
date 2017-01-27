package calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *���ӻ���������
 * @author simor
 *
 */
public class visablecalendar {
	public static void main(String[]args){
		System.out.println("���������ڣ���ʽΪ��yyyy-mm-dd");
		Scanner scanner=new Scanner(System.in);
		String temp=scanner.nextLine();
		DateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date date=format.parse(temp);
			Calendar calendar=new GregorianCalendar();
			calendar.setTime(date);
			int day=calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE,1);
			System.out.println();
			int maxDate= calendar.getMaximum(Calendar.DATE);
			System.out.println(maxDate);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
				System.out.print('\t');
			}
			for(int i=1;i<=maxDate;i++){
				if(i==day){
					System.out.print("*");
				}
				System.out.print(i+"\t");
				int w=calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY){
					System.out.println();
				}
				calendar.add(Calendar.DATE,1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
