package com.zhangshuai.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class RandomUtilTest {

	@Test
	/**
	 * 
	 * @Title: testRandom 
	 * @Description: 随机数的实现方法
	 * @return: void
	 */
	void testRandom() {
		int random = RandomUtil.random(1, 3);
		System.out.println(random);
	}
    /**
     * 
     * @Title: testSubRandom 
     * @Description: 集合中循环不重复
     * @return: void
     */
	@Test
	void testSubRandom() {
	    for (int i = 0; i <10; i++) {
			Set<Integer> subRandom = RandomUtil.subRandom(1,10,3);
			System.out.print(subRandom);
		}
	}
    /**
     * 
     * @Title: testRandomCharacter 
     * @Description: 随机返回单个字符串
     * @return: void
     */
	@Test
	void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());;
	}
     /**
      * 
      * @Title: testRandomString 
      * @Description: 返回字符串10个
      * @return: void
      */
	@Test
	void testRandomString() {
		System.out.println(RandomUtil.randomString(10));;
	}

}
