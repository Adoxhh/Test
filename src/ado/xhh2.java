package ado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class xhh2 {
	public static void main(String[] args) {
//		LocalDate tim = 
//		Calendar c =
//		// System.out.println(getDateByShortStr("2007-2-6"));
//		String str = "2017-01-19 11:30:04";
//		String str2 = "Thu Mar 15 00:00:00 CST 2018";
//		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(new Date());
		String dateString = sdf.format(new Date());
		System.out.println("日期转字符串: " + dateString);
		LocalDate.now();
		System.out.println(LocalDate.now());

	}
}