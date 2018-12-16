package test.string.method;

public class TestSplit {

	public static void main(String[] args) {
		// 하나의 문자열을 토큰문자기준으로 여러 개의 문자열로 분리하는 것
		String s = "red yellow green blue purple";
		String []sar = s.split(" ");
		System.out.println(sar.length + "개");
		
		//객체배열과 컬렉션은 for each문 사용
		for(String temp : sar) {
			System.out.print(temp + " ");
		}
		System.out.println("\n━━━━━━━━━━━━━━━");
		
		
		String s2 = "java,oracle,jdbc";
		String []sar2 = s2.split(",");
		
		for(String temp : sar2) {
			System.out.print(temp + " ");
		}
		System.out.println("\n━━━━━━━━━━━━━━━");
		
		String s3 = "html5 css3,javaScript&Query♪webapi";
		String []sar3 = s3.split(" |,|&|♪");
		
		for(String temp : sar3) {
			System.out.print(temp + " ");
		}

	}

}
