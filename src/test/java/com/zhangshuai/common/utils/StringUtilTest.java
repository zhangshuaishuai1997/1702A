package com.zhangshuai.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;

class StringUtilTest {
    
	/**
	 * 
	 * @Title: testHasLength 
	 * @Description:判断源字符串是否有值，空引号(空白字符串)也算没值 的测试
	 * @return: void
	 */
	@Test
	void testHasLength() {
		System.out.println(StringUtil.hasLength("1321431"));
	}
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值 的测试
	 * @return: void
	 */
	@Test
	void testHasText() {
		System.out.println(StringUtil.hasText(" 1321546"));
	}
	/**
	 * 
	 * @Title: testRandomChineseString 
	 * @Description: 介绍的循环输出
	 * @throws UnsupportedEncodingException
	 * @return: void
	 */
	@Test
	void testRandomChineseString() throws UnsupportedEncodingException {
		for (int i = 0; i < 5; i++) {
			StringBuilder randomChineseString = StringUtil.randomChineseString(5);
			System.out.println(randomChineseString);
		}
	}
    /**
     * 
     * @Title: testRandomChineseStringInt 
     * @Description: 单个字符串
     * @throws UnsupportedEncodingException
     * @return: void
     */
	@Test
	void testRandomChineseStringInt() throws UnsupportedEncodingException {
		System.out.println(StringUtil.randomChineseString());
	}
	/**
	 * 
	 * @Title: testGenerateChineseName 
	 * @Description: 名字的测试
	 * @throws UnsupportedEncodingException
	 * @return: void
	 */
	@Test
	void testGenerateChineseName() throws UnsupportedEncodingException {
	  System.out.println(StringUtil.generateChineseName());
	}

}
