package test.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class TestLocale {
	private static Calendar newyork;
	
	public static void printDate(Calendar today) {
		GregorianCalendar newyork = new GregorianCalendar(
		TimeZone.getTimeZone("US/Newyork"), Locale.US);
		
		printDate(newyork);
	}
	
	public static void main(String []args) {
		TestLocale ss = new TestLocale();
		ss.printDate(newyork);
	}

}
