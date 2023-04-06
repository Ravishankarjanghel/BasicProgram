package dateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class CalanderClass {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("US/Alaska"));
		//Calendar c1 = Calendar.getInstance();
		System.out.println(c.getTimeZone().getID());
		//System.out.println(c1.getTimeZone().getID());
		System.out.println(c.getTime());
		//System.out.println(c1.getTime());

	}

}
