package ch11.예외처리2;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) { //리소스 자동 닫기를 위해 이렇게 선언하기
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try (res1; res2) { //res1,res2에 객체 미리 저장해넣고 ;로 나누어서 넣어도 된다.
			String data1 = res1.read1();
			String data2 = res2.read1();
		}catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
