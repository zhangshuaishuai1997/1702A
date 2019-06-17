package com.zhangshuai.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.zhangshuai.common.entity.Person;
import com.zhangshuai.common.utils.RandomUtil;
import com.zhangshuai.common.utils.StringUtil;

class PersonTest {

	@Test
	/**
	 * 
	 * @Title: test 
	 * @Description: 实体类的一万次循环
	 * @throws UnsupportedEncodingException
	 * @return: void
	 */
	void test() throws UnsupportedEncodingException {
		for (int i = 0; i < 10000; i++) {
			Person person = new Person(StringUtil.generateChineseName(), RandomUtil.random(1,120),StringUtil.randomChineseString(),new Date());
		    System.out.println(person);
		}
	     
	}

}
