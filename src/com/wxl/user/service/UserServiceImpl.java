package com.wxl.user.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.base.AbstractService;
import com.wxl.user.dao.UserDao;
import com.wxl.user.dao.UserDaoImpl;
import com.wxl.user.model.User;

@Service
public class UserServiceImpl extends AbstractService<User, Integer> implements UserService {
	@Autowired
	private UserDaoImpl userDaoImpl;

	@Autowired
	@Override
	public void setBaseMapper() {
		this.baseDao = userDaoImpl;
	}

	@Override
	public void print(int id) {
		User user = this.selectByPrimaryKey(id);
		System.out.println(user);
		System.out.println(JSON.toJSONString(user));
	}
	public User find(int id) {
		User user = this.selectByPrimaryKey(id);
		System.out.println(user);
		System.out.println(JSON.toJSONString(user));
		return user;
	}
	public void show() {
		List<User> findAll = userDaoImpl.findAll();
		for (User user : findAll) {
			System.out.println(JSON.toJSONString(user));
		}
	}

}
