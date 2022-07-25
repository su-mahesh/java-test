package java8.DateTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now();
		System.out.println("the current date is " + date);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd,MM-yyyy HH:mm:ss");
		
		System.out.println(date.format(format));
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(LocalDate.parse("2015-02-28"));
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
		System.out.println(sunday);
		
		boolean Before = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(Before);
		
		
		LocalTime now = LocalTime.now();
		System.out.println(now.getHour());
		
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println(sixThirty.getSecond()	);
		boolean Before1 = LocalDate.parse("2016-06-12")
				  .isBefore(LocalDateTime.parse("2016-06-11").toLocalDate());
		System.out.println(Before1);
		
		
		
		
	}

}
