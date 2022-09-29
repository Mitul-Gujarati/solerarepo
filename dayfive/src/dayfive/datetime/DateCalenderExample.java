package dayfive.datetime;
import java.util.Calendar;
/*
 * first give format
 * */
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateCalenderExample {
	public static void main(String[] args) {

		//convert date to string.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String date = sdf.format(new Date());
		System.out.println(date);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "27-09-2022 10:09:56";

		try 
		{
			Date date1 = sdf1.parse(dateInString);
			System.out.println(date1);
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}

		//get current date and time
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-D hh:mm:ss ZD");//in this constructor we simple give format only.
		Date date2 = new Date();
		System.out.println(sdf2.format(date2));


		//convert calendar to date
		Calendar calendar = Calendar.getInstance();//calling static getInstance method of Calendar class.
		Date date3 = calendar.getTime();
		System.out.println(sdf1.format(date3));


		//simple calendar example
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy MMM dd");
		Calendar cal = new GregorianCalendar(2022,9,27,10,21,58);

		int year = cal.get(Calendar.YEAR);
		System.out.println("Year---"+year);
		int month = cal.get(Calendar.MONTH);
		System.out.println("Month---"+month);
		System.out.println("Date---"+Calendar.DATE);
		System.out.println(""+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(""+cal.get(Calendar.DAY_OF_WEEK));

		//(Like 27 is in week 4 of this month)
		System.out.println("week number for given date: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		//setting the date manually 
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		Calendar c = new GregorianCalendar(2022,8,27,10,52,54);
		System.out.println("year--"+year);
		System.out.println("month--"+month);
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfMonth--"+dayOfMonth);
		System.out.println("dayOfWeek--"+dayOfWeek);

		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= cal.get(Calendar.WEEK_OF_MONTH);

		int hour       = cal.get(Calendar.HOUR);        // 12 hour clock
		int hourOfDay  = cal.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		int minute     = cal.get(Calendar.MINUTE);
		int second     = cal.get(Calendar.SECOND);
		int millisecond= cal.get(Calendar.MILLISECOND);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
		System.out.println(sdf4.format(c.getTime()));
	}
}
