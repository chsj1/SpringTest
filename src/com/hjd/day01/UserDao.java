package com.hjd.day01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
 * Component的作用:往IOC容器中加入<bean>对象
 * 
 * @Component("userDao")相当于:
 * <bean id="userDao" class="xxxx.xxx.xxx.UserDao"/>
 * 其中<Component>中的userDao相当于<bean>中的id
 */
//@Component("userDao")
@Repository
public class UserDao {
	public void save(){
		System.out.println("------>调用了dao的save方法");
	}
}
