package ch18_입출력스트림.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while (true) {
				int data = is.read(); //1byte씩 읽기
				if (data == -1) break; //read()가 마지막 바이트 이후에 더 읽으면 -1을 리턴한다.
				System.out.println(data);
				
			}
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
