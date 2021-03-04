package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<Board>();
		
		//객체 저장
		list.add(new Board(1, "제목1")); //객체
		list.add(new Board(2, "제목2")); //값, 
		list.add(new Board(3, "제목3"));
		System.out.println(list.size());
		
		//객체 얻기
		Board board1 = list.get(0); //강제 타입변환 (String)
		System.out.println(board1.getBno() + ":" + board1.getTitle());
		Board board2 = list.get(1);
		Board board3 = list.get(2);
		
		//반복 처리
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		for(Board board : list) { //저장된 수만큼 돈다.
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());

	}

}
