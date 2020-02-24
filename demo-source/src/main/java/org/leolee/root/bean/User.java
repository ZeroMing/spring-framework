package org.leolee.root.bean;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年02月25 00时17分
 */
public class User {
	private Integer age;
	private String name;

	public User(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
