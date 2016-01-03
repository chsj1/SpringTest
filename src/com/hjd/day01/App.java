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
}
