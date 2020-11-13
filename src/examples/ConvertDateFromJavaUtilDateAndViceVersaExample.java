package examples;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateFromJavaUtilDateAndViceVersaExample {

	public static void main(String[] args) {

		Date date = new Date(System.currentTimeMillis());
		System.out.print(date);
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("java 8 local date from util.Date "+localDate);

		LocalDate now = LocalDate.now();
		Date from = Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		System.out.println(" java.util.Date from java 8 LocalDate "+from);

	}

}
