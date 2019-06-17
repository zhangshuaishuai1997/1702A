package com.zhangshuai.common.utils;

import java.sql.Date;
import java.util.Calendar;

public class DateUtil {
	
	public static Date getDateutil(Date src) {
		Calendar m=Calendar.getInstance();
		m.setTime(src);
		m.set(Calendar.DAY_OF_MONTH,1);
        m.set(Calendar.HOUR_OF_DAY,0);
		m.set(Calendar.MINUTE,0);
		m.set(Calendar.SECOND,0);
		return src;
		
	}

}
