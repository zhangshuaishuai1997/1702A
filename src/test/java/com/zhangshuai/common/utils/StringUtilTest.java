package com.zhangshuai.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testToUniqueTerm() {

String str = StringUtil.toUniqueTerm("Spring MVC");
System.out.println(str);
//boolean b = StringUtil.isMobile("19123345678");
boolean b = StringUtil.isEmail("111@163.net");
System.out.println(b);
	}

}
