package test.string.method;

public class TestStringValue {
	
	public static void stringToData() {
		//문자열값 => 기본자료형값으로 변경 : parsing(파싱)
		//Wrapper(래퍼) 클래스에서 메소드로 제공
		//기본자료형에 관한 클래스 = 래퍼클래스
		//String value = "apple"; -> 숫자형식이 아니기 때문에 ERROR
		String value = "12345";
		int num = Integer.parseInt(value);
		System.out.println(num);
		
		int num2 = Integer.valueOf(value);
		//풀어서 쓰면 아래와 같다. 위와 같은 경우를 Auto UnBoxing 처리가 되었다고 한다.
		//객체를 값으로. 객체 -> 값
		//Integer ref = Integer.valueOf(value); //Integer클래스 사용했기 때문에 캡슐화가 되어있는 상태
		//int num2 = ref.intValue();
		
	}

	public static void main(String[] args) {
		//문자열값 <=> 기본자료형값 변환처리하는 방법
		stringToData();
	}

}
