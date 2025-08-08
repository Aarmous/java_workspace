package ch08;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println(c);
		System.out.println(c.MONTH);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(Calendar.YEAR) + "년");
		System.out.println(c.get(Calendar.MONTH) + 1 + "월");
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println();
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));

	}

}
