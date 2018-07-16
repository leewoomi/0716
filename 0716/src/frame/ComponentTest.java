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

		Checkbox cb1 = new Checkbox("����");
		Checkbox  cb2 = new Checkbox("��ȭ����");
		Checkbox  cb3 = new Checkbox("��������");
		Checkbox  cb4 = new Checkbox("����");
		Checkbox  cb5 = new Checkbox("���α׷���");
		Checkbox cb6 = new Checkbox("���ǰ���");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		p.add(cb5);
		p.add(cb6);
		
		//���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group,false);
		
		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		
		
		p.add(ch);
		
		p.add(man);
		p.add(woman);
		
		//5���� �����ְ� ���� ���� ������ �� �ֵ��� ���ִ� List 
		List list  = new List(5,true);
		list.add("������");
		list.add("��¡��Ƣ��");
		list.add("�踻��");
		list.add("����");
		list.add("��ġ�");
		list.add("�δ��");
		list.add("���κ��");
		
		p.add(list);
		
		//list�� remove(int idx)�� �̿��ϸ� idx �� ° �� ���� �� �ִ�.
		//list.remove(0);
		//ù��°�� 5��³�� ���� 
		//���� �׸��� ���� �� ���� ���� ���� �� �ڿ��� ���� �����ϴ� ���� ����.
		//�տ��� ���� ����� ����ؾ� �ؼ� �Ǽ��� �� �� ����.
		list.remove(4);
		list.remove(0);
		add(p);
		setVisible(true);
	}
}
