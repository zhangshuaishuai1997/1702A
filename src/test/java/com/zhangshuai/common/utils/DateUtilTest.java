package com.zhangshuai.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

class DateUtilTest {

	@Test
	/**
	 * 
	 * @Title: testGetDateutil 
	 * @Description: 时间的测试
	 * @return: void
	 */
	void testGetDateutil() {
		Date dateutil = DateUtil.getDateutil(new Date(0));
		SimpleDateFormat m=new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		System.out.println(m.format(dateutil));
	}

}
