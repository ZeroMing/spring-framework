package org.leolee.root.config;

import org.leolee.root.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年02月25 00时16分
 */
@Configuration
@ComponentScan(basePackages = {"org.leolee.root"})
public class JavaConfig {
	@Bean
	public User user(){
		return new User(101,"ganquanzhong");
	}

}
