package com.hjd.day01;

public class ObjectFactory {
	
	public User getInstance(){
		System.out.println("----->调用工厂的实例方法来创建对象");
		return new User(3,"jdh","putuoqu");
	}
	
	public static User getStaticInstance(){
		System.out.println("调用工厂的静态方法来创建对象");
		return new User(4,"huangjundong","changingqu");
	}
}
