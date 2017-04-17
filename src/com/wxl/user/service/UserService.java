package com.wxl.user.service;

import org.springframework.stereotype.Service;

import com.wxl.user.model.User;

@Service
public interface UserService {
	void print(int id);
	User find(int id);
}
