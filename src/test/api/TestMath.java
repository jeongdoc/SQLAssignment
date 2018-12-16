package test.api;

public class TestMath {

	public static void main(String[] args) {
		// Math Class Test
		
		//절대값 반환
		/*int i = Math.abs(-10);
		double d = Math.abs(-10.0);
		System.out.println(i + ", " + d);*/
		
		
		//값 올림
		/*double d = Math.ceil(10.1);
		double d2 = Math.ceil(-10.1);
		double d3 = Math.ceil(10.0000015);
		System.out.println(d + ", " + d2 + ", " + d3);*/
		
		//값 버림 반환
		/*double d = Math.floor(10.0);
		double d2 = Math.floor(-10.8);
		System.out.println(d + ", " + d2);*/
		
		//값 비교 후 큰 값 반환
		/*double d = Math.max(9.5, 9.5000001);
		int i = Math.max(0, -1);
		System.out.println(d + ", " + i);*/
		
		//값 비교 후 작은 값 반환
		/*double d = Math.min(9.5, 9.5000001);
		int i = Math.min(0, -1);
		System.out.println(d + " , " + i);*/
		
		//0.0~1.0 범위 사이의 임의 double값 반환. 0.0 포함, 1.0 미포함
		/*double d = Math.random();
		int i = (int)(Math.random() * 10) + 1;
		System.out.println(d + ", " + i);*/
		
		//double값의 가장 가까운 정수값 반환
		/*double d = Math.rint(5.55);
		double d2 = Math.rint(5.11);
		double d3 = Math.rint(-5.55);
		System.out.println(d + ", " + d2 + ", " + d3);*/
		
		//소수점 첫째자리에서 반올림한 long값 반환
		/*long l = Math.round(5.55);
		long l2 = Math.round(5.11);
		long l3 = Math.round(-5.55);
		double d = 90.7552;
		double d2 = Math.round(d * 100) / 100.0;
		System.out.println(l + ", " + l2);
		System.out.println(l3);
		System.out.println(d + ", " + d2);*/

	}

}
