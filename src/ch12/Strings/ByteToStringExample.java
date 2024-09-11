package ch12.Strings;

import java.util.Arrays;

public class ByteToStringExample {
	public static void main(String[] args) throws Exception{
		String data = "자바";
		
		//String -> byte 배열
		byte[] arr1 = data.getBytes("UTF-8");
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		//byte 배열 -> String
		String str1 = new String(arr1,"UTF-8");
		System.out.println("str1 : "+str1);
		
		//String -> byte 배열
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
				
		//byte 배열 -> String
		String str2 = new String(arr2,"EUC-KR");
		System.out.println("str2 : "+str2);
	}
}
