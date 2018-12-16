package test.datetime;

import java.util.*;
import java.text.*;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// java.util.GregorianCalendar Test
		// java.text.SimpleDateFormat Test
		/*GregorianCalendar today = new GregorianCalendar();*/
		Calendar today = new GregorianCalendar();
		//System.out.println(today);
		
		GregorianCalendar cristmas = new GregorianCalendar();
		//System.out.println(cristmas);

		System.out.println(cristmas.get(Calendar.DAY_OF_WEEK));
		
		//get으로 꺼낼 수 있지만 그러기엔 꺼낼 양이 너무 많을 때
		SimpleDateFormat sdf = new SimpleDateFormat("2020-12-25 (E)");
		
		String str = sdf.format(cristmas.getGregorianChange());
		System.out.println();
		
		System.out.println(str);
		System.out.println(sdf.format(today.getTime()));
		

	}

}
