package dateTime;

import java.lang.ref.Cleaner.Cleanable;
import java.util.Calendar;

public class CalenderTimeDate {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int dd = c.get(Calendar.DATE);
		int mm = c.get(Calendar.MONTH);
		int yy = c.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		

	}

}
