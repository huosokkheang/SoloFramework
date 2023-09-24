package com.solo.framework.dateTime;

import java.util.Date;

import com.core.util.date.SDateUtil;
import com.core.util.date.STimeUtil;

public class TimeAgo {
	
	public static void main(String[] args) {
		Date fromDate = SDateUtil.stringToDate("21-09-2023 11:45:20 am", "dd-MM-yyyy HH:mm:ss a"); 
		Date currentDate = SDateUtil.stringToDate("21-09-2023 11:45:23 am", "dd-MM-yyyy HH:mm:ss a"); 
		String date = STimeUtil.timeAgo(currentDate, fromDate);
		System.out.println(date);
	}
}
