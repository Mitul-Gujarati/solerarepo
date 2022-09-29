package dayfive.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date date1 = new Date();
		System.out.println("Our first date is: "+date1);
		
		Date date2 = new Date(999999999999L);
		System.out.println("our second date is: "+date2);
		
		Date date3 = new Date(999999999999L);

		System.out.println("Our third date is : " + date3);
		
		//after() is checks the date come after or not
		if(date1.after(date2))
		{
			System.out.println("Our first date is after our second date.");
		}
		
		//before() is checks the date come after or not
		if(date1.before(date2))
		{
			System.out.println("Our first date is after our second date.");
		}
		else 
		{
			System.out.println("Our first date is not before our second date.");
		}
		
		//getTime() is used to get time from January 1970 to till date or given date. 
		System.out.println(date1.getTime());
		
		//for split the time and date we first create a string variable and after convert into String[] and split with space.
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		System.out.println(sdf.format(date3));
		String formatDate = sdf.format(date3);
		String[] dates = formatDate.split(" ");
		for(String date : dates)
		{
			System.out.println(date);
		}
		
	}
}
