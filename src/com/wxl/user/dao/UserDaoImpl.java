package com.wxl.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wxl.user.model.User;

@Repository
public interface UserDaoImpl extends UserDao {
	@Select({ "select", "id, name, pwd, createTime, email, phone", "from user" })
	public List<User> findAll();
}
