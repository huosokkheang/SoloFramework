package com.solo.framework.time;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.util.date.SDateFormatUtil;
import com.core.util.date.STimeUtil;

@RestController
public class Time {
	
	@RequestMapping("/ago")
	public String ago() {
		Date fromDate = SDateFormatUtil.stringToDate("21-09-2023 11:45:20 am", "dd-MM-yyyy HH:mm:ss a"); 
		Date currentDate = SDateFormatUtil.stringToDate("21-09-2023 11:45:23 am", "dd-MM-yyyy HH:mm:ss a"); 
		String date = STimeUtil.timeAgo(currentDate, fromDate);
		return date;
	}
}
