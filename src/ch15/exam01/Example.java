package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//��ü ����
		list.add("ȫ�浿"); //��ü
		list.add(3); //��, 
		list.add(new Board());
		System.out.println(list.size());
		
		//��ü ���
		String name = (String) list.get(0); //���� Ÿ�Ժ�ȯ (String)
		int value = (Integer) list.get(1);
		Board board = (Board) list.get(2);
		
		//��ü ����
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
