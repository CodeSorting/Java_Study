package ch18_입출력스트림.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyExample {
	public static void main(String[] args) {
		try {
			//test.jpg는 내가 다운 받은 파일, test2.jpg는 명령어에 의해 복사된것.
			String originalFileName = "C:/Temp/test.jpg";
			String targetFileName = "C:/Temp/test2.jpg";
			
			InputStream is = new FileInputStream(originalFileName);
			OutputStream os = new FileOutputStream(targetFileName);
			
			//java9부터 is.transferTo(os);로 대체 가능하다.
			byte[] data = new byte[1024];
			while (true) {
				int num = is.read(data);
				if (num == -1) break;
				os.write(data,0,num);
			}
			os.flush();
			os.close();
			is.close();
			
			System.out.println("복사가 잘 되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
