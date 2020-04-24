package review.wrap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTest {

	public static void main(String[] args) throws ParseException {

		//1.int -> String
		int num = 10;
		String str = Integer.toString(num);
		System.out.println("16진수 : "+Integer.toHexString(num));
		
		//2.Double ->String
		double dnum = 4.15;
		str = Double.toString(dnum);
		//str = dnum+"";
		System.out.println("double:"+str);
		
		
		//3.String ->int
		String snum = "1010";
		num = Integer.parseInt(snum);
		
		//4.String ->double
		String ddnum = "4.15";
		dnum = Double.parseDouble(ddnum);
		
		//5.String ->Double (클래스 타입)
		Double dobj = Double.parseDouble(snum); //double변환 ->박싱
	
		//6.기본형 double --> 기본형int
		num = (int)dnum;
		
		//7.객체 Double ->int
		num = dobj.intValue();
		
		//8.date -> long
		Date today = new Date();
		long todayNum = today.getTime();
		System.out.println("todayNum :" + todayNum);
		
		//9.long ->Date
		Date hireDate = new Date(todayNum);
		
		
		//10.Date -> String
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		String strDate = format.format(hireDate);
		System.out.println("strDate:"+strDate);
		
		
		//11. String -> Date
		String xmas = "2020/12/25    12:2";
		SimpleDateFormat xformat = new SimpleDateFormat("yyyy/mm/dd hh:mm");
		hireDate = xformat.parse(xmas);
		System.out.println("String -> Date:"+hireDate);
		
		
	}

}
