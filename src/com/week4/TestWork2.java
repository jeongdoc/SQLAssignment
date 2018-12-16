package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {
	public void token() {
	String s = "J a v a  P r o g r a m";
	System.out.println("토큰 처리전 출력 : " + s);
	System.out.println("토큰 처리 전 글자 개수 : " + s.length() + "개");
	
	String []sar = s.split(" ");
	System.out.println("토큰 처리 후 글자 개수 : " + sar.length + "개");	
	
	System.out.print("car 출력 : ");
	char[] car = s.toCharArray();
	for(int x = 0; x < car.length; x ++) {
		System.out.print(car[x]);
	}
	
	//Tokenizer 써서도 해보기
	
	String ss2 = new String(car);
	
	
	System.out.println("\nchar to String : " + ss2);
	System.out.println("대분자 변환 : " + ss2.toUpperCase());
	
	
	
	
	
	
	
	}
	
	public static void main(String []args) {
		TestWork2 e = new TestWork2();
		e.token();
	}
	
	

}
