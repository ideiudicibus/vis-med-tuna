package it.deiudi.www.util.date;



import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.GregorianCalendar;

import java.text.ParseException;

public class DateUtils {

	public static final String DATE_FORMAT_DDMMYYYY = "dd/MM/yyyy";

	public static final String DATE_FORMAT_DDMMYYYY_HHMM = "dd/MM/yyyy hh:mm";

	public static String format(Date date) {

		if (date == null)

			return null;

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_DDMMYYYY);

		return sdf.format(date);

	}

	/**
	 * 
	 * converte una data da una rappresentazione ad un' altra restituisce la
	 * rappresentazione della data
	 * 
	 * nel destFormat
	 * 
	 * @param date
	 *            Date
	 * 
	 * @param sourceFormat
	 *            String
	 * 
	 * @param destFormat
	 *            String
	 * 
	 * @return String
	 */

	public static String formatConverter(String sourceDate,
			String sourceFormat,

			String destFormat) {

		SimpleDateFormat sdf = new java.text.SimpleDateFormat(sourceFormat);

		String result = null;

		try {

			Date d = sdf.parse(sourceDate);

			result = format(d, destFormat);
			d=null;

		} catch (ParseException ex) {

		}

		return result;

	}

	public static String format(Date date, String format) {

		if (date == null)

			return null;

		SimpleDateFormat sdf = new SimpleDateFormat(format);

		return sdf.format(date);

	}

	public static boolean equalsDateString(Date date1, Date date2,
			String formatDate) {

		if (formatDate == null)

			throw new NullPointerException(
					"Error in equalsDate formatDate is null");

		String d1 = format(date1, formatDate);

		String d2 = format(date2, formatDate);

		return d1.equals(d2);

	}

	public static boolean equalsDateString(Date date1, Date date2)
			throws Exception {

		try {

			return equalsDateString(date1, date2,DATE_FORMAT_DDMMYYYY);

		} catch (Exception e) {

			throw e;

		}

	}

	public static Date now() {

		Date d = new Date();

		d.setTime(System.currentTimeMillis());

		return d;

	}

	public static Date today() {

		return getDateAtMidnight(now());

	}

	public static Calendar toCalendar(Date date) {

		if (date == null)

			return null;

		Calendar c = new GregorianCalendar();

		c.setTime(date);

		return c;

	}

	public static Date getDateAtMidnight(Date date) {

		GregorianCalendar gc = new GregorianCalendar();

		gc.setTime(date);

		gc.set(GregorianCalendar.HOUR_OF_DAY, 0);

		gc.set(GregorianCalendar.MINUTE, 0);

		gc.set(GregorianCalendar.SECOND, 0);

		gc.set(GregorianCalendar.MILLISECOND, 0);

		return gc.getTime();

	}

	/**
	 * 
	 * restituisce un oggetto Date a partire da una stringa che rapprensenta una
	 * data in un formato
	 * 
	 * 
	 * 
	 * @param sourceDate
	 *            String
	 * 
	 * @param sourceFormat
	 *            String
	 * 
	 * @return Date
	 * 
	 * @throws ParseException
	 */

	public static java.util.Date getDateObject(String sourceDate,
			String sourceFormat) throws ParseException {

		try {

			SimpleDateFormat sdf = new java.text.SimpleDateFormat(sourceFormat);

			Date d = sdf.parse(sourceDate);

			return d;

		}

		catch (ParseException pex) {

			throw pex;

		}

	}
	
	public static java.util.Date subtractDaysFromNow(int days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -days);
		return cal.getTime();

	}

}// fine DateUtil


