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
		Date fromDate = SDateFormatUtil.stringToDate("10-10-2023 11:45:20", "dd-MM-yyyy HH:mm:ss"); 
		Date EndDate = SDateFormatUtil.stringToDate("10-10-2023 11:45:30", "dd-MM-yyyy HH:mm:ss"); 
		String date = STimeUtil.timeAgo(EndDate, fromDate);
		return date;
	}
}
