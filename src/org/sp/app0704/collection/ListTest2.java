package org.sp.app0704.collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class ListTest2 {
	public static void main(String[] args) {
		//컬렉션 사용시 Generic 타입을 명시하면, 불순물(원하는 자료형 이외의 객체)을 방지할 수 있고.
		//무엇보다 꺼낼 때 형변환 과정을 거치지 않아도 되는 편리함이 있다.
		List<JButton> list = new ArrayList<JButton>();
		
		list.add(new JButton("버튼1"));
		list.add(new JButton("버튼2"));
		list.add(new JButton("버튼3"));
		
		JButton obj = list.get(0);
	}
}
