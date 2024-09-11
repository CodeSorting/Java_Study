package ch18_입출력스트림.OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			//데이터 도착지를 test1.db파일로 하는 바이트 출력 스트림 생성
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//1byte씩 출력
			os.write(a); 
			os.write(b);
			os.write(c);
			os.write(40);
			os.write(57);
			//byte[] array = {10,20,30};
			//os.write(array); 이렇게 출력할 수도 있다. 보통 이걸 더 씀.
			//os.write(array,1,2) -> 1번인덱스부터 2개 출력(1~2번인덱스 출력)
			
			//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움.
			os.flush();
			//출력 스트림을 닫아 사용한 메모리를 해제
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("C:/Temp/test1.db")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.printf("%02X ", byteData); // 16진수 형식으로 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
