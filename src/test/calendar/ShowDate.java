package test.calendar;

public class ShowDate {

	public static void main(String[] args) {
		// DateCalculator 실행용
		DateCalculator totalDay = new DateCalculator();
		
		System.out.println(totalDay.isLeapYear(2018) == true ? "윤년" : "평년");
		
		long total = totalDay.getDays();
		System.out.println("총 날짜 수 : " + total);

	}

}
