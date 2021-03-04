package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		
		map.put("s1","홍길동");
		map.put("s2","감자바");
		map.put("s3","방돌이");
		map.put("s4","박길순");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
		System.out.println();
		
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Map<String, String> smap = map.subMap("s3", true, "s5", true);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key + ": " + map.get(key));
		}
	}

}
