package com.hjd.day01;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * Component������:��IOC�����м���<bean>����
 * 
 * @Component("userDao")�൱��:
 * <bean id="userDao" class="xxxx.xxx.xxx.UserDao"/>
 * ����<Component>�е�userDao�൱��<bean>�е�id
 * 
 * Ĭ��������һ��	
 * 
 * service�����ʹ��@Service����
 * dao�����ʹ��@Repository����
 */
//@Component("userService")
@Service
public class UserService {
	/*
	 * Resource������:��IOC�������ҵ�<bean>����.
	 * 
	 * @Resource(name="userDao")
	 * private UserDao userDao;�൱��:
	 * <property name="userDao" ref="userDao"/>
	 * ����Resource�е���ô�����൱��ref�е�����.
	 * 
	 * Ĭ�ϸ�������������.(��ʱ��Ҫȷ��������ֻ��һ�������͵�����)
	 */
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void save(){
		userDao.save();
	}
}
