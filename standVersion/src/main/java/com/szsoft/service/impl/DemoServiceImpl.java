package com.szsoft.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szsoft.mapper.DemoMapper;
import com.szsoft.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	DemoMapper demoMapper;

	public String DemoTest() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list = demoMapper.getDemoInfo();
		System.out.println("aaabbbccc");
		return "demoTest22";
	}

}
