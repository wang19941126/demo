package com.ht.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.mapper.TestMapper;
import com.ht.model.Test;
import com.ht.service.TestService;
@Transactional
@Service
public class TestServiceImpl implements TestService{
	
	@Resource
	private TestMapper testMapper;
	
	@Override
	public List<Test> list() {
		// TODO Auto-generated method stub
		return testMapper.list();
	}

	@Override
	public void insert(Test t) {
		// TODO Auto-generated method stub
		testMapper.insert(t);
	}

	@Override
	public void update(Test t) {
		// TODO Auto-generated method stub
		testMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		testMapper.delete(id);
	}

	@Override
	public Test getById(Integer id) {
		// TODO Auto-generated method stub
		return testMapper.getById(id);
	}

}
