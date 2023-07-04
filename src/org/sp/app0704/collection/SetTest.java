package org.sp.app0704.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java의 컬렉션 프레임웤이 지원하는 객체 중, 순서 없는 집합을 표현하는 Set을 학습한다.
 * 
 * */
public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("딸기");
		set.add("복숭아");
		set.add("자두");
		
		//순서 없는 집합의 요소들을 순서 있게 늘어뜨려 준다.
		Iterator<String> it= set.iterator();
		
		//Iterator에 의해 순서가 생긴 상태이므로 반복문으로 요소들을 꺼낼 수 있다.
		while(it.hasNext()) {
			String s = it.next(); //커서 이동과 함께, 해당 위치의 객체 반환
			System.out.println(s);
		}
		
		//자바의 컬렉션 중 Set, Map은 순서가 없기 때문에 반복문으로 직접 요소들을 제어할 수는 없지만,
		//Iterator, Enumeration 같은 도구들을 이용하면, 순서있게 처리가 가능하다.
		
		
	}
}
