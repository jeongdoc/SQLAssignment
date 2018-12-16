package test.object.method;

public class TestMember {

	public static void main(String[] args) {
		// 메소드 오버라이딩 테스트
		Member m = new Member("홍길동", 27, 1530.);
		System.out.println("m : " + m);
		
		Member m2 = (Member)m.clone(); //clone이 Object를 리턴했기 때문에 Member로 형변환해주어야함.
		
		System.out.println("m2 : "+ m2);
		
		System.out.println("m == m2 : " + (m == m2));
		System.out.println("m hash : " + m.hashCode());
		System.out.println("m2 hash : " + m2.hashCode());

	}

}
