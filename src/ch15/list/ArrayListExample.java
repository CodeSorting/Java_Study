package ch15.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오고 출력하기
		for (int i=0;i<list.size();++i) {
			board = list.get(i);
			System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		}
		System.out.println();
		
		list.remove(2); // 2번 인덱스 삭제 -> 3번 인덱스가 2번 인덱스로 온다.
		list.remove(2); // 2(초기 3번) 인덱스 제거
		for (Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}
