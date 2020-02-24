package org.leolee.root;

import org.leolee.root.bean.User;
import org.leolee.root.config.JavaConfig;
import org.leolee.root.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年02月25 00时13分
 */
public class BootStrap {

	public static void main(String[] args) {
		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) ac.getBean("user");
		System.out.println(user.toString());
		IUserService bean = ac.getBean(IUserService.class);
		bean.playDog();
	}
}
