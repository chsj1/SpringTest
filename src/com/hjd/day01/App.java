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
	
	
	/**
	 * singleton:在创建容器之前就创建了对象.默认是singleton模式
	 * prototype:在用到对象的时候才创建对象
	 */
	@Test
	public void test_createBean1(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->创建容器");
		
		System.out.println(ac.getBean("user"));
		System.out.println(ac.getBean("user"));
		
		ac.destroy();
	}
	
	/**
	 * 创建对象的讲解
	 */
	@Test
	public void test_createBean2(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->创建容器");
		
		System.out.println(ac.getBean("user"));
		System.out.println(((User)ac.getBean("user")).getId() + " " +((User)ac.getBean("user")).getName() + " " +((User)ac.getBean("user")).getAddress());
		
		ac.destroy();
	}
	
	/**
	 * init-methodhedestroy-method的讲解
	 */
	@Test
	public void test_initAndDestroy(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->创建容器");
		
		System.out.println(ac.getBean("user"));
		System.out.println(ac.getBean("user"));
		
		ac.destroy();
	}
	
	@Test
	public void testDI(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		UserAction userAction = (UserAction)ac.getBean("userAction");
		userAction.execute();
	}
	
}
