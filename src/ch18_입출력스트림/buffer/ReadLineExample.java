package ch18_입출력스트림.buffer;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception {
		//FileReader에 BufferedReader 보조 스트림 연결
		BufferedReader br = new BufferedReader(new FileReader("src/ch18_입출력스트림/buffer/ReadLineExample.java"));
		
		int linenum = 1;
		while (true) {
			String str = br.readLine();
			if (str==null) break;
			System.out.println(linenum + "\t" + str);
			linenum++;
		}
		
		br.close();
	}
}
