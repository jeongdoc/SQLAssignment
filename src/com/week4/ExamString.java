package com.week4;

public class ExamString {
	public String preChar(String s) {
		StringBuilder sb = new StringBuilder(s);
		char ch = sb.charAt(0);
		
		if(Character.isLowerCase(ch)) {
			ch -=32;
		}
		
		sb.setCharAt(0, ch);
		return sb.toString();
		
	}
	public int charSu(String s, char ch) {
		int count = 0;
		
		for(int x = 0; x < s.length(); x ++) {
			if(s.charAt(x) == ch)
				count++;
		}
		return count;
	}
	
	

}
