package org.sp.app0704.collection;

import java.util.ArrayList;

/*
 * java의 컬렉션 프레임워크 중, List를 학습해본다.
 * List는 순서가 있는 객체의 모임을 표현하며, 우리가 기존에 알고 있었던 배열과 거의 같다. 
 * 차이점)
 * 1) 크기가 동적으로 변할 수 있다.
 * 2) 배열은 int[], byte[], short[] 등 모든 자료현마다 지원되지만,
 * 		컬렉션 프레임워크는 그 대상이 오직 객체만 다루기 때문에 List에 들어올 수 있는 데이터는 오직 객체형 데이터만 가능하다.
 * */

public class ListTest {

	public static void main(String[] args) {
		//ArrayList 는 List 인터페이스의 자식
		ArrayList list = new ArrayList();
		
		list.add("사과");
		list.add("키위");
		list.add("수박");
		list.add("복숭아");
		System.out.println("현재까지 채워진 과일 수는 "+list.size());
	}
}
