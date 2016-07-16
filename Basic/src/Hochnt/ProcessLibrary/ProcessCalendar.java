package Hochnt.ProcessLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProcessCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		System.out.println("Nam: " + year);
		
		Date t = cal.getTime();
		System.out.println(": " + t);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(": " + sdf.format(t));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/yy");
		System.out.println(": " + sdf2.format(t));
	}

}
