package com.hjd.day01;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/*
 * Component������:��IOC�����м���<bean>����
 * 
 * @Component("userDao")�൱��:
 * <bean id="userDao" class="xxxx.xxx.xxx.UserDao"/>
 * ����<Component>�е�userDao�൱��<bean>�е�id
 */
//@Component("userDao")
@Repository
public class UserDao {
	public void save(){
		System.out.println("------>������dao��save����");
	}
}
