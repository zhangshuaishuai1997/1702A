package com.zhangshuai.common.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

public class RandomUtilTest {
	//返回指定个数中文汉字字符串，字符集必须在 GB2312(相当于中文简体)范围内；
	/*
	@Test
	public void testDate() {
		Calendar c = Calendar.getInstance();
		//月份0--11 
		c.set(2010, 0, 1);
		//获取2010年1月1日的毫秒数
		long l = c.getTimeInMillis();
		System.out.println(l);
		//设置日历时间为当前的日期
		c.setTime(new Date());
		//当前时间的毫秒数
		long l2 = c.getTimeInMillis();
		System.out.println(l2);
		for(int i =0;i<1000;i++) {
	    long x =	l+ (long) (Math.random() * (l2 -l));
	    //用毫秒数设置为当前日历日期
	 c.setTimeInMillis(x);
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	 System.out.println(df.format(c.getTime()));
		}
	}
	
	
	@Test //4
	public void testGetRandomStr2() {
		for(int i =1;i<10;i++) {
		String str = RandomUtil.getRandomStr(4);
		System.out.println(str);
		}
		
	}

	@Test //3
	public void testGetRandomStr() {
		for(int i =1;i<10;i++) {
		String str = RandomUtil.getRandomStr();
		System.out.println(str);
		}
		
	}
	
	@Test //2
	public void testGetRandomNumber2() {
		int[] a;
		for(int i =1;i<10;i++) {
		a = RandomUtil.getRandomNumber(1, 10, 5);
		 System.out.println(Arrays.toString(a));
		}
	
	
	}
	

	@Test //1
	public void testGetRandomNumber() {
		for (int i =1;i<= 10; i++) {
			System.out.println(RandomUtil.getRandomNumber(2, 5));
		}
	
	}
*/
}
