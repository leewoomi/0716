package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ComponentTest extends Frame {



	public ComponentTest() {
		setTitle("ComponentTest");
		setLocation(300,300);
		setSize(600,700);
		
		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("독서");
		Checkbox  cb2 = new Checkbox("영화감상");
		Checkbox  cb3 = new Checkbox("종이접기");
		Checkbox  cb4 = new Checkbox("게임");
		Checkbox  cb5 = new Checkbox("프로그래밍");
		Checkbox cb6 = new Checkbox("음악감상");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		p.add(cb5);
		p.add(cb6);
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group,false);
		
		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		
		
		p.add(ch);
		
		p.add(man);
		p.add(woman);
		
		//5개를 보여주고 여러 개를 선택할 수 있도록 해주는 List 
		List list  = new List(5,true);
		list.add("떡볶이");
		list.add("오징어튀김");
		list.add("김말이");
		list.add("피자");
		list.add("김치찌개");
		list.add("부대찌개");
		list.add("순두부찌개");
		
		p.add(list);
		
		//list의 remove(int idx)를 이용하면 idx 번 째 를 지울 수 있다.
		//list.remove(0);
		//첫번째와 5번쨀르 제거 
		//여러 항목이 있을 때 여러 개를 지울 때 뒤에서 부터 제거하는 것이 좋다.
		//앞에서 부터 지우면 계산해야 해서 실수를 할 수 있음.
		list.remove(4);
		list.remove(0);
		add(p);
		setVisible(true);
	}
}
