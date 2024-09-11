package ch17.Stream5;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	@Override
	public int compareTo(Student o) { //comparable 인터페이스 구현
		return Integer.compare(score, o.score); //오름차순정렬
	}
}
