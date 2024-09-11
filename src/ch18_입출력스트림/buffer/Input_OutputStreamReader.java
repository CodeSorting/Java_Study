package ch18_입출력스트림.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Input_OutputStreamReader { // 보조 스트림 예시
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림 사용");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt"); //해당 파일 생성
		Writer writer = new OutputStreamWriter(os, "UTF-8"); // outputstream -> writer
		writer.write(str); // writer로 쓰기
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt"); 
		Reader reader = new InputStreamReader(is, "UTF-8"); // inputstream -> reader
		char[] data = new char[100];
		int num = reader.read(data); // reader로 읽기
		reader.close();
		String str = new String(data,0,num);
		return str;
	}
}
