package org.leolee.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年02月25 00时31分
 */
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IDogService dogService;


	@Override
	public void playDog() {
		System.out.println(dogService.getClass().getName());
	}
}
