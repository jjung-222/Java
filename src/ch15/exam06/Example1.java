package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("�ڱ��");
		
		for(String item : set) {
			System.out.println(item); //����������
		}
		
		NavigableSet<String> nset = set.descendingSet();
		for(String item : nset) {
			System.out.println(item);
		}
	}

}
