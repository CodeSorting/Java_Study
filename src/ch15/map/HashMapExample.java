package ch15.map;

import java.util.HashMap; //HashMap, Iterator, Map, MapEntry, Set
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("조강유", 85);
		map.put("현건우", 10);
		map.put("유지훈", 20);
		map.put("김동건", 100);
		System.out.println("총 개수 : " + map.size());
		
		String key = "김동건";
		int value = map.get(key); // 키를 보내면 해당하는 값을 받는다.
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String k = iterator.next();
			Integer v = map.get(key);
			System.out.println(k + ": " + v);
		}
		System.out.println();
		
		//엔트리 set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		
		//키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
	}
}
