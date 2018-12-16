package test.datetime;

import java.util.*;

public class TestCalendar {

	public static void main(String[] args) {
		// java.util.Calendar Test
		//sub 클래스인 GregorianCalendar사용 Test
		Calendar today; //Abstract class
		
		today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		int weekDay = today.get(Calendar.DAY_OF_WEEK);
		int time = today.get(Calendar.HOUR);
		int minutes = today.get(Calendar.MINUTE);
		int seconds = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);
		//정수값 리턴
		
		String week = null;
		switch(weekDay) {
		case 1 : week = "일요일"; break;
		case 2 : week = "월요일"; break;
		case 3 : week = "화요일"; break;
		case 4 : week = "수요일"; break;
		case 5 : week = "목요일"; break;
		case 6 : week = "금요일"; break;
		case 7 : week = "토요일"; break;
			default :
			
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + week + " " + (ampm == 0 ? "오전" : "오후")
							+ time + "시 " + minutes + "분 " + seconds + "초");

	}

}
