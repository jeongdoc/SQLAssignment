package test.object.method;

public class Member {
	//Field
	private String name;
	private int age;
	private double point;
	
	//Constructor
	public Member() {
		super(); //Object의 기본 생성자를 실행. 아무것도 상속받지 않았기 때문.
	}

	public Member(String name, int age, double point) {
		super(); //기본생성자와 같은 이유로 Object() call.
		this.name = name;
		this.age = age;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		//return "클래스명@16진수코드를 문자열로" 
		return this.name + ", " + this.age + "세, " + this.point + "점";
	}
	
	@Override
	public boolean equals(Object obj) {
		//return this == (Member)ojb; 주소가 같은지 비교 
		Member other = (Member)obj; //DownCasting 필요
		
		return (this.name.equals(other.name) && this.age == other.age
				&& this.point == other.point);
		//this가 참조하는 객체와 other가 참조하는 객체가 같은지 boolean 판단
	}
	
	@Override
	/*protected*/ public Object clone() /*throws CloneNotSupportedException*/ {
		//return this; 원래 this(주소)리턴함. 주소가 복사되게 하는 메소드
							//--> 주소만 복사 : 얕은 복사(shallow copy)
		//Deep Copy : 깊은 복사 -> 이거로 Overriding할 수 있음.
		return new Member(this.name, this.age, this.point); //Deep Copy
		//return this;
		
	}
	

}
