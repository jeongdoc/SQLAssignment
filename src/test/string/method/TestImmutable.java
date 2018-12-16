package test.string.method;

public class TestImmutable {

	public static void main(String[] args) {
		// String is Immutable "
		// String. 문자열 저장소에 기록된 문자열 값은 절대로 수정할 수 없다.
		
		String s = "java";
		String s2 = new String("java");
		
		System.out.println("s == s2 주소 : " + (s == s2));
		System.out.println("hashCode 비교 : " + (s.hashCode() == s2.hashCode()));
		//참조하고 있는 문자열이 기록된 위치값으로 Return받게끔 Override되어있음.
		//문자열저장소는 한 번 기록된 문자열을 두 번 기록하지 않는다.
		//이미 기록된 문자열의 위치를 return
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println();
		
		//Immutable : 변경불가
		String s3 = s.toUpperCase();
		System.out.println("s : " + s);
		System.out.println("s3 : " + s3);
		System.out.println();
		
		System.out.println("s : " + s.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		//따라서 수정조작시 계~속 메모리점유율이 올라간다. 변경불가능이라 계속 추가하는 식으로
		//출력할 수 밖에 없기 때문.

	}

}
