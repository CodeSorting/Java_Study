package ch18_입출력스트림.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample_array {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db"); // 데이터 출발지를 test2.db인 입력 스트림 생성

			byte[] datas = new byte[100]; 
			
			while (true) {
				int num = is.read(datas); //최대 100byte를 읽고 읽은 바이트는 data 저장, 읽은 수는 리턴
				if (num == -1) break;
				for (int i=0;i<num;++i) {
					System.out.println(datas[i]);
				}
			}
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
