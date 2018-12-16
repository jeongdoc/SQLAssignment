package test.string.method;

public class TestStringMethod {

	/*public static void main(String[] args) {
		// String Method Test (java.lang.String)
		String s = "";
		//초기값으로 빈 따옴표를 사용
		//char c = ''; -> ERROR
		char c = ' '; //공백이라도 넣어주어야 ERROR가 안 남.
		//char는 빈 따옴표 사용X
		
		System.out.println("글자 개수 : " + s.length() + "개");
		
		String s1 = null; //General
		//System.out.println(s1.length());	
		//s1 = "apple";
		if(s1 != null && s1.length() > 0)
			System.out.println(s1.length());
		else
			System.out.println("문자열값이 필요합니다.");
		//에러메세지를 사용자로부터 감추는 법*/
	
	public static void main(String []args) {
		/*String s1 = "apple";
		String s2 = new String("banana");
		
		byte []bar = {74, 65, 86, 65};
		String s3 = new String(bar);
		
		char []car = {'o', 'r', 'a', 'c', 'l', 'e'};
		String s4 = new String(car);
		
		int []iar = {74, 65, 86, 65};
		String s5 = new String(iar, 0, iar.length).toLowerCase();
		
		StringBuilder sb = new StringBuilder("html5 & css3");
		String s6 = new String(sb);
		
		System.out.println("s1 : " + s1.toString() + ", s2 : " + s2 + ", s3 : " + s3 +"\ns4 : " + s4
							+ ", s5 : " + s5 + ", s6 : " + s6);*/
		//String 클래스 Method 사용법
		/*String s = "Hello";
		String n = "0123456";
		char c = s.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c + ", " + c2);
		
		String s1 = "Hello";
		String s2 = s.concat(" World");
		System.out.println(s2);
		
		String s3 = "abcdefg";
		boolean b = s3.contains("bc");
		System.out.println(b);
		
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println(b1);
		
		String s4 = "Hello";
		boolean b2 = s4.equals("Hello");
		boolean b3 = s4.equals("hello");
		System.out.println(b2 + ", " + b3);
		
		String s5 = "Hello";
		boolean b4 = s5.equalsIgnoreCase("HELLO");
		boolean b5 = s5.equalsIgnoreCase("hello");
		System.out.println(b4 + ", " + b5);
		
		String s6 = "Hello";
		int idx1 = s6.indexOf("o");
		int idx2 = s6.indexOf("k");
		System.out.println(idx1 + ", " + idx2);
		
		String s7 = "ABCDEFG";
		int idx3 = s7.indexOf("CD");
		System.out.println(idx3);*/
		
		/*String s = new String("abc");
		String s2 = new String("abc");
		boolean b = (s == s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		System.out.println(b + ", " + b2 + ", " + b3);
		
		String s3 = "java.lang.Object";
		int idx1 = s3.lastIndexOf('.');
		int idx2 = s3.indexOf('.');
		System.out.println(idx1 + ", " + idx2);
		
		String s4 = "java.lang.java";
		int idx3 = s4.lastIndexOf("java");
		int idx4 = s4.indexOf("java");
		System.out.println(idx3 + ", " + idx4);*/
		
		/*String s = "Hello";
		int length = s.length();
		System.out.println(length);
		String s1 = s.replace('H', 'C');
		System.out.println(s1);
		
		String s2 = "Hellollo";
		String s3 = s2.replace("ll", "LL");
		System.out.println(s3);
		
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println(r);
		String r1 = ab.replaceFirst("BB", "bb");
		System.out.println(r1);*/
		
		/*String animals = "dog,cat,bear";
		String []arr = animals.split(",");
		for(int x = 0; x < arr.length; x ++) {
			System.out.println("arr [" + x + "] = " + arr[x]);
		}
		System.out.println();
		
		String []arr1 = animals.split(",", 2);
		for(int x = 0; x < arr1.length; x ++) {
			System.out.println("arr1 [" + x + "] = " + arr1[x]);
		}
		
		String s = "java.lang.Object";
		boolean b = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		System.out.println(b + ", " + b2);
		
		String c = s.substring(10);
		String p = s.substring(5,9);
		System.out.println(c + ", " + p);*/
		
		/*String s = "Hello";
		String s1 = s.toString();
		String s2 = s.toLowerCase();
		String s3 = s.toUpperCase();
		
		String s4 = "  Hello World  ";
		String s5 = s4.trim();
		System.out.println(s1 + ", " + s5);*/
		
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		
		System.out.println(b + ", " + c + ", " + i + ", " + l + ", " + f + ", " + d);
		System.out.println(dd);
		
	}

}
