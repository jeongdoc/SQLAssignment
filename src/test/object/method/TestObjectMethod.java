package test.object.method;

public class TestObjectMethod {

	public static void main(String[] args) {
		// java.lang.Object클래스는 모든 자바의 조상이다.
		// Object 클래스의 모든 메소드는 자바로 만든 클래스들이 자신의 메소드처럼 사용할 수 있다.
		
		Member mm = new Member();
		
		System.out.println("mm hashCode → " + mm.hashCode());
		System.out.println("mm toString → " + mm.toString());
		
		Member mm2 = mm; //주소복사
		System.out.println();
		
		System.out.println("주소가 같으냐? " + mm.equals(mm2));
		System.out.println(mm == mm2); // 두 개다 주소물어보는 것
		

	}

}
