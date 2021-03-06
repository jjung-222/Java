package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "겨울"), new Board(1, "겨울"));
		map.put(new User("winter", "여름이"), new Board(2, "여름"));
		//똑같은 키로 주면 이전 키값은 지워짐
		
		System.out.println(map.size());
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
	}

}
