package test.calendar;

import java.util.GregorianCalendar;

public class DateCalculator {
	public long getDays() {
		long sumDays = 0L;
		
		GregorianCalendar today = new GregorianCalendar();
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		long [][]iar = new long[4][30];
		long [][]iar2 = new long[7][31];
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			sumDays += 366;
			
		} else {
			sumDays +=365;
			
		}
		
		long sum = 0;
				;
		for(month = 1; month < iar.length; month ++) {
			for(day = 1; day < iar[month].length; day ++) {
				sum += iar[month][day];
			}
			System.out.println(sum);
		}
		//System.out.println(sum);
		/*for(long[] sum : iar) {
			
		}*/
		
		return 0L;
		
	}
	public boolean isLeapYear(int year) {
		boolean b = false;
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) 
			b = true;
		
		return b;
		
	}
	public static void main(String []args) {
		DateCalculator dd = new DateCalculator();
		dd.getDays();
	}

}
