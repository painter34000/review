package review.wrap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {


		//검색
		String path = "c:/app/image/pig.jpg";
		
		//문자열 객체 전부를 발췌
//		int idex = String.substring(int start);
//		System.out.println(idex);
		
		String idex1 = path.substring(, start);
		System.out.println("전부 발췌:" + idx1);
		
		//1.맨 끝의 '/'의 위치를 찾고 싶다   (lastindexof)명령어 사용
		int idx = path.lastIndexOf("/");
		System.out.println("/위치 : "+idx);
		
		int idx1 = path.lastIndexOf("/");
		System.out.println("/위치 :"+idx1);
//		
//		//2.파일명만 추출   lastindexof, substing'
		String filename = path.substring(idx+1);
		System.out.println("filename:"+ filename);
		
		String filename1 = path.substring(idx+1);
		System.out.println("filename:"+ filename1);
		
//		//3.파일이 jpg로 끈나는지  알고싶다.  endWhit
		boolean jpgyn = path.endsWith("jpg");
		System.out.println("파일이 jpg로 끝나는지 체크 :"+jpgyn);
				
		boolean jpgyn1 = path.endsWith("jpg");
		System.out.println("파일이 jpg로 끝나는지 체크 : "+jpgyn1);
		
//		//4.문자열 자르기 ('/'기준으로 문자열을 자름)
		String[] paths = path.split("");
				for(String p : paths) {
					System.out.println(p);
				}
				System.out.println("paths 출력:"+paths);

//		5.패턴 체크(대소문자 8자리) regexp(regular exprestion) 정규표현식
				String pattern = "\"^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$\"\r\n";
				String pw = "ab1223Q";
				boolean result = validationPasswd(pw,pattern);
				System.out.println("패턴검사:" + result);
	}

	
	private static boolean validationPasswd(String pw, String pattern) {
		Pattern p = Pattern.compile("정규식");
		Matcher m = p.matcher(pw);

		if (m.matches()) {
			return true;
		}
		return false;
	}
}
