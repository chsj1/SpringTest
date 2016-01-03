package com.hjd.day01;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App{
	
	/*
	 * 使用Spring来创建对象
	 * 
	 * 通过工厂类来得到容器创建的对象
	 */
	@Test
	public void test_ioc(){
		//读取配置文件
		ClassPathResource resource = new ClassPathResource("com/hjd/day01/applicationContext.xml");
		//创建IOC容器.(创建Bean工厂)
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		System.out.println(((User)factory.getBean("user")));
		System.out.println(((User)factory.getBean("user")).getId());
	}
	
	@Test
	public void test_ioc1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		System.out.println(ac.getBean("user"));
	}
}
