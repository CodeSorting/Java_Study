package ch15.map;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		//영어 단어와 페이지 번호를 무작위로 저장하고 검색하기
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//정렬된 엔트리를 하나씩 가져오기
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		Iterator<Entry<String,Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + ": " + v);
		} //for (Entry<String,Integer> tmp : entrySet)으로 해도 된다.
		System.out.println();
		
		Entry<String,Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("(제일 앞 단어)" + entry.getKey() + ": " + entry.getValue());
		
		entry = treeMap.lastEntry();
		System.out.println("(제일 뒷 단어)" + entry.getKey() + ": " + entry.getValue());
		
		entry = treeMap.lowerEntry("ever");
		System.out.println("(ever 앞 단어)" + entry.getKey() + ": " + entry.getValue());
		System.out.println();
		
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String,Integer>> descendingEntrySet = descendingMap.entrySet();
		for (Entry<String,Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		System.out.println("[c~h사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		for (Entry<String,Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
	}
}
