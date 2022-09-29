package dayfive.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateExample {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		LocalDate date = LocalDate.now();
		System.out.println("Todays Date is: "+date);
		LocalDate yesterday = date.minusDays(1); //minusDAys is give past date minus given number
		System.out.println("Yesterday Date is: "+yesterday);
		LocalDate tomrrow = date.plusDays(1); ////minusDAys is give future date plus given number
		System.out.println("Tomorrow Date is: "+tomrrow);

		//checking given date is in leap year or not.
		System.out.println(LocalDate.now().isLeapYear());

		//giving custom to check the year is leap or not.
		LocalDate dat1 = LocalDate.of(2016, 1, 31);
		System.out.println(dat1.isLeapYear());

		//printing newly added date
		System.out.println(dat1);

		//printing date along with Time using LocalDateTime.
		LocalDateTime dateWithTime = dat1.atTime(1,50,9);
		System.out.println(dateWithTime);

		//Get current date
		LocalDate currentDate = LocalDate.now();
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Current date in string -------"+strDate);

		//printing custom date.
		LocalDate cDate = LocalDate.of(2022, 07, 02);
		System.out.println("Current Date is string -----"+cDate.format(DateTimeFormatter.ISO_DATE));

		//Convert string into a LocalDate'
		String dateString= "2022-08-01";
		LocalDate d1 = LocalDate.parse(dateString);
		System.out.println("The Date Is: "+d1);
		System.out.println(d1.getDayOfMonth());
		System.out.println("count how many days passed till date: "+d1.getDayOfYear());
		System.out.println("giving month in number: "+d1.getMonthValue());
		System.out.println("giving month in name format: "+d1.getMonth());

		System.out.println("**********************Custom Format using Date and SimpleDateFormat*********************");
		Date dt = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDt = formatter.format(dt);
		System.out.println(strDt);

		System.out.println("**********************Custom Format using LocalDate and DateTimeFormatter*********************");
		LocalDate d2 = LocalDate.now();
		System.out.println(d2);
		String formattedDate = d2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
	}
}
