package com.hjd.day01;

public class ObjectFactory {
	
	public User getInstance(){
		System.out.println("----->���ù�����ʵ����������������");
		return new User(3,"jdh","putuoqu");
	}
	
	public static User getStaticInstance(){
		System.out.println("���ù����ľ�̬��������������");
		return new User(4,"huangjundong","changingqu");
	}
}
