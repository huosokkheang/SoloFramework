package com.solo.framework.dateTime;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Date;

import com.core.collection.SList;
import com.core.collection.Solo;
import com.core.exception.business.SException;
import com.core.util.date.SDateConvertUtil;
import com.core.util.date.SDateUtil;

public class DateUtil {
	
	public static void main(String[] args) throws ParseException, SException {
		String strDate = "10-10-2023";
		String dateFormat = "dd-MM-yyyy";
		String currentDate = SDateUtil.getCurrentDate(dateFormat);
		
		//String date to timestamp
		String timestamp = SDateConvertUtil.convertDateToTimeStamp(strDate, dateFormat);
		System.out.println("TimeStamp :" + timestamp);
		
		// Timestamp to Date
		Date date = SDateConvertUtil.convertTimestapmToDate(timestamp);
		System.out.println("Date :" + date);
		
		// Date to StrDate
		String stringDate = SDateConvertUtil.dateToString(date, dateFormat);
		System.out.println("Date :" + stringDate);
		
		// StrDate to Date
		Date Date = SDateConvertUtil.stringToDate(stringDate, dateFormat);
		System.out.println("Date :" + Date);
		
		// formatDate fromDate to toDate
		String StringDate = SDateConvertUtil.formatDateTimeFromTo(stringDate, dateFormat, "yyyy-MM-dd");
		System.out.println("Date :" + StringDate);
		
		// getDay (st,nd, rd, th)
		String day = SDateUtil.getDay("1-10-2023", dateFormat);
		System.out.println("Day: " + day);
		
		// getWeek (st,nd, rd, th)
		String getWeek = SDateUtil.getWeek("15-10-2023", dateFormat);
		System.out.println("Week: " + getWeek);
		
		// getMonth English
		String getMonth = SDateUtil.getMonth("15-10-2023", dateFormat);
		System.out.println("Month: " + getMonth);
		
		// getMonth Number
		String getMonthNumber = SDateUtil.getMonthNumber("15-10-2023", dateFormat);
		System.out.println("MonthNumber: " + getMonthNumber);
		
		// getYear
		String getYear = SDateUtil.getYear("15-10-2023", dateFormat);
		System.out.println("Year: " + getYear);
		
		// getYear
		int getBirthdayYear = SDateUtil.calculateAge("15-10-1990", currentDate, dateFormat);
		System.out.println("getBirthdayYear: " + getBirthdayYear);
		
		// IndexOfDayWeek
		String IndexOfDayWeek = SDateUtil.getIndexDayOfWeek();
		System.out.println("IndexOfDayWeek: " + IndexOfDayWeek);
		
		//getCurrentTime
		String getCurrentTime = SDateUtil.getTime();
		System.out.println("getCurrentTime: " + getCurrentTime);
		
		//getCurrentHour
		String getCurrentHour = SDateUtil.getHour();
		System.out.println("getCurrentHour: " + getCurrentHour);
		
		//getCurrentMinute
		String getCurrentMinute = SDateUtil.getMinute();
		System.out.println("getCurrentMinute: " + getCurrentMinute);
		
		//getCurrentSecond
		String getCurrentSecond = SDateUtil.getSecond();
		System.out.println("getCurrentSecond: " + getCurrentSecond);
		
		//getNano
 		String getNano = SDateUtil.getNano();
		System.out.println("getNano: " + getNano);
		
		//listSundayOfTheYear
		SList listSundayOfTheYear = SDateUtil.listSundayOfTheYear(dateFormat, Integer.parseInt(getYear));
		System.out.println("listSundayOfTheYear: " + listSundayOfTheYear);
		
		//listSaturdayOfTheYear
		SList listSaturdayOfTheYear = SDateUtil.listSaturdayOfTheYear(dateFormat, Integer.parseInt(getYear));
		System.out.println("listSaturdayOfTheYear: " + listSaturdayOfTheYear);
		
		//listFridaysOfTheYear
		SList listFridaysOfTheYear = SDateUtil.listFridaysOfTheYear(dateFormat, Integer.parseInt(getYear));
		System.out.println("listFridaysOfTheYear: " + listFridaysOfTheYear);
		
		//IndexOfSundayOfTheYear
		Solo IndexOfSundayOfTheYear = SDateUtil.IndexOfSundayOfTheYear(dateFormat, 1);
		System.out.println("IndexOfSundayOfTheYear: " + IndexOfSundayOfTheYear);
		
		//IndexOfSaturdayOfTheYear
		Solo IndexOfSaturdayOfTheYear = SDateUtil.IndexOfSaturdayOfTheYear(dateFormat, 1);
		System.out.println("IndexOfSaturdayOfTheYear: " + IndexOfSaturdayOfTheYear);
		
		//IndexOfFridayOfTheYear
		Solo IndexOfFridayOfTheYear = SDateUtil.IndexOfFridayOfTheYear(dateFormat, 1);
		System.out.println("IndexOfFridayOfTheYear: " + IndexOfFridayOfTheYear);
		
		// getIndexDayOfWeek
		String getIndexDayOfWeek = SDateUtil.getIndexDayOfWeek();
		System.out.println("getIndexDayOfWeek: " + getIndexDayOfWeek);
		
		// getCurrentDay
		String getCurrentDay = SDateUtil.getDay();
		System.out.println("getCurrentDay: " + getCurrentDay);
		
		// getCurrentMonth
		String getCurrentMonth = SDateUtil.getMonth();
		System.out.println("getCurrentMonth: " + getCurrentMonth);
		
		// getDay
		String getDay = SDateUtil.getDay();
		System.out.println("getDay: " + getDay);
		
		// getCurrentYear
		String getCurrentYear = SDateUtil.getYear();
		System.out.println("getCurrentYear: " + getCurrentYear);
		
		// getDate
		String getDate = SDateUtil.Date();
		System.out.println("getDate: " + getDate);
		
	}

}
