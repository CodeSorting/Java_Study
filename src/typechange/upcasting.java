package typechange;

class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }

    void childMethod() {
        System.out.println("Child specific method");
    }
}

public class upcasting {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child; // 업캐스팅: Child 객체를 Parent 타입으로 변환
        
        parent.show(); // 자식 클래스의 메서드가 호출됨 (다형성)
    }
}
