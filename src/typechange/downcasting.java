package typechange;

public class downcasting {
    public static void main(String[] args) {
        Parent parent = new Child(); // 업캐스팅 : 자동변환
        Child child = (Child) parent; // 다운캐스팅 : 강제변환
        
        child.show(); // Child의 show() 메서드 호출
        child.childMethod(); // Child만의 메서드 호출
    }
}
