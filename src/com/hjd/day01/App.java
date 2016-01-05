package com.hjd.day01;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App{
	
	/*
	 * ʹ��Spring����������
	 * 
	 * ͨ�����������õ����������Ķ���
	 */
	@Test
	public void test_ioc(){
		//��ȡ�����ļ�
		ClassPathResource resource = new ClassPathResource("com/hjd/day01/applicationContext.xml");
		//����IOC����.(����Bean����)
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
	 * singleton:�ڴ�������֮ǰ�ʹ����˶���.Ĭ����singletonģʽ
	 * prototype:���õ������ʱ��Ŵ�������
	 */
	@Test
	public void test_createBean1(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->��������");
		
		System.out.println(ac.getBean("user"));
		System.out.println(ac.getBean("user"));
		
		ac.destroy();
	}
	
	/**
	 * ��������Ľ���
	 */
	@Test
	public void test_createBean2(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->��������");
		
		System.out.println(ac.getBean("user"));
		System.out.println(((User)ac.getBean("user")).getId() + " " +((User)ac.getBean("user")).getName() + " " +((User)ac.getBean("user")).getAddress());
		
		ac.destroy();
	}
	
	/**
	 * init-methodhedestroy-method�Ľ���
	 */
	@Test
	public void test_initAndDestroy(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("com/hjd/day01/applicationContext.xml");
		
		System.out.println("---->��������");
		
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
