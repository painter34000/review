package review.wrap;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionTest2 {
	public static void main(String[] args) {

		ArrayList<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("100", "홍길동"));
		list.add(new MemberVO("101", "길길동"));
		list.add(new MemberVO("102", "동길동"));

		// List ->set
	//	Set<E> set = ---
		// Set ->List

		// List<VO> 특정필드 vo 로 검색 , 정렬
		// 아이디 순으로 정렬
		Collections.sort(list, new Comparator<MemberVO>() {

			@Override
			public int compare(MemberVO o1, MemberVO o2) {
				return o1.getUserid().compareTo(o2.getUserid());
			}
		});
		System.out.println(list);

		// 이름순으로 정렬 (람다식)
//		Collections.sort(list, 
//				(MemberVO o1, Member o2) -> o1.getUsername().compareTo
//				(o2.getUsername())
//				);
//		System.out.println(list);

		// 역순
		
		Collections.reverse(list);
		System.out.println(list);
		// 섞기 shu

	}
}
