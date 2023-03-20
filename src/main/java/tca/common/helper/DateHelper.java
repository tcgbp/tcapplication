package tca.common.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {

	public static final String DATE_FORMAT_1 = "HH";
	public static final String DATE_FORMAT_2 = "yyyy-MM-dd";
	public static final String DATE_FORMAT_3 = "yyyy-MM-dd hh:mm";
	public static final String DATE_FORMAT_4 = "dd/MM/yyyy";

	public static String format(Date date, String format) {
		if (date == null) return "";
		return new SimpleDateFormat(format).format(date);
	}

	public static Date parse(String date, String format) {
		try {
			return new SimpleDateFormat(format).parse(date);
		} catch (Exception e) {
			return null;
		}
	}

	public static Date getTmrOf(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}

	public static Date truncDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal.getTime();
	}
}
