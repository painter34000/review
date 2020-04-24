package Part1;

public class Operatortest {
	public static void main(String[] args) {
		//삼항연산
		int score = 80;
		String grade =  score >=60 ? "success" : "fail";
		boolean booleangrade = score >=60 ? true : false;
		char chargrade =  score >90 ? 'A': score >80 ? 'B': 'C';				
				//90>=a  80>=b  80<c
				System.out.println("등급 : "+ chargrade);
		
		//야구게임  :  컴퓨터 렌덤 2 4 6 , 유저 1 2 3   Os 1b,   조건: 10회 이내,   3S 이면 게임 종료,  아니면 게임 종료
				// 컴퓨터가 서로 다른 난수 3개 만듬 (같은 수 x)
				// if, for 문
				// 수도코드 ,    컴퓨터가 난수 3개 만듬
				// 스트라익 0으로 초기화
				// 게임 횟수 0으로 초기화
				// 스트라익이 3이거나, 게임횟수가 10 이상이면 게임 종료
				// 아니면 반복
				// 사용자가 숫자 3개를 입력  ,  같은자리 컴퓨터 숫자와 사용자 숫자의 비교
				// 스트라익3이면 게임종료 출력,  아니면 게임오버 출력
				
				// 변수 : com1, com2, com3
				//      usr1, usr2, usr3
				//  	cnt, s, b
				//
		
		// 증감
		int a = 5;
		int b = 10;
		int c = a++ + ++b; // 더하기가 뒤에있으면 계산하고 나서 증가 , 앞에 있으면 먼저 증가하고 계산

		System.out.println(String.format("%5d, %5d,%%5", a, b, c));

		// 논리 (&& \\ ! ) a가 10~20 인지 검사
		boolean b1 = a > 10 && a < 20;      //  && = 그리고
		System.out.println("논리연산:" + b1);

		boolean b2 = a > 10 || a < 20;    //   || = or
		System.out.println("논리연산:" + b2);
		

		boolean b3 = !(a > 10 && a < 20);   // 전체 부정 ! <---전체부정 잘 사양하자
		System.out.println("논리연산:" + b3);

		boolean b4 = !(a> 10 || a<20);
		System.out.println();
		
		boolean b5 = ((a>=10 && a<=20) && (b>=10 && b<20));
		System.out.println(b3);
		int a1 = 0;
		System.out.println(a1++ + ++a1 + ++a1 + a1++ + ++a1);
		
		Integer inta = 10;
		Integer intb = null;
		b1 = inta >= 10 && intb >=20;
		System.out.println(b1);
		
	}
}
