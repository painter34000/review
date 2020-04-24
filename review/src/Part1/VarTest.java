package Part1;

/*
 * 데이터 타입, 상수타입
 */

public class VarTest {
	public static void main(String[] args) {

		//정수형 진수
		
		char c1 =  0xAC00;  //'가'  //  '\uac00';
		System.out.println('\uac00');
		int num1 = 0xff;  //16
		int num2 = 010;  //8
		int num3 = 10;  
		System.out.println(String.format("%5d %5d %5d", num1, num2, num3));
		
		
		
		//8가지 데이타 타입 byte, shot, int, long, float, double, boolean, char
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//BigDecimal  <--long 보다 더큰 타입
		//overflow 를 막기 위해  상황에 맞게 타입 사용
		
		//실수 -> 유효자리수를 판단  0.0001 = 10000  <- 유효자리 수는 같다
		//0.00001 ->1 * 10^-6
		//100000 -> 1 * 10^6
		//0.12345678 -> 1.2345678 * 10^-7
		float fnum = 0.123456789f;    //float는 7자리까지 표현 가능 
		System.out.println(fnum);
		
		double dnum = 0.123456789;   //double은 15자리까지 표현 가능
		System.out.println(dnum );
		
		//char -> 유니코드에 데이터 값을 사용 
		char c='가';
		System.out.println(Integer.toHexString((int)c));
		
		char c9 = '\uac01';
		System.out.println(c9);
		
		//65 97
		char c2 = 'A';
		System.out.println((char)(c2+32));
		
		for(int i=0; i < 127; i++) {
			System.out.println(i+"\t"+(char)i);
		}
		//상수 타입
		//int double
		long lnum = 1000000000L;
		// 마지막 'L'을 붙여서  long 타입인것을 표현해야 정확한 숫자 나옴
	}
	
	
}
