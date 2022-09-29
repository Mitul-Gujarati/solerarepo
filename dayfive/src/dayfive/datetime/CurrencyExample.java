package dayfive.datetime;

import java.util.Currency;
import java.util.Locale;

public class CurrencyExample {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.getAvailableLocales().toString());

		//predefine final class implementing Serializable interface.
		Currency c = Currency.getInstance(Locale.GERMANY);
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getSymbol());
		System.out.println(c.getDisplayName());

		System.out.println(Locale.getDefault().getCountry());
		System.out.println(Locale.getDefault().getDisplayName());
		System.out.println(Locale.getDefault().getDisplayCountry());
		System.out.println(Locale.getDefault().getScript());
	}
}
