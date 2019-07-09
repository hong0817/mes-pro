package com.mes.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mes.dao.TestUserMapper;
import com.mes.model.TestUser;

public class Spring_MybatisTest {
	
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	private TestUserMapper testUserMapper;
	@Test
	public void testMapper() {
		testUserMapper=bean.getBean(TestUserMapper.class);
		TestUser user=TestUser.builder().name("bean01").build();
		testUserMapper.insertSelective(user);
	}

}