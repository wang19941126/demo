package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.UserMapper;
import com.ht.model.User;
import com.ht.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userMapper.list();
	}

	@Override
	public void insert(User t) {
		// TODO Auto-generated method stub
		userMapper.insert(t);
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		userMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userMapper.delete(id);
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getById(id);
	}

}
