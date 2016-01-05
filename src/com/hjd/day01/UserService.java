package com.hjd.day01;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
 * Component的作用:往IOC容器中加入<bean>对象
 * 
 * @Component("userDao")相当于:
 * <bean id="userDao" class="xxxx.xxx.xxx.UserDao"/>
 * 其中<Component>中的userDao相当于<bean>中的id
 * 
 * 默认与类名一样	
 * 
 * service层可以使用@Service代替
 * dao层可以使用@Repository代替
 */
//@Component("userService")
@Service
public class UserService {
	/*
	 * Resource的作用:在IOC容器中找到<bean>对象.
	 * 
	 * @Resource(name="userDao")
	 * private UserDao userDao;相当于:
	 * <property name="userDao" ref="userDao"/>
	 * 其中Resource中的那么属性相当于ref中的内容.
	 * 
	 * 默认根据类型来查找.(这时候要确保容器中只有一个该类型的配置)
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
