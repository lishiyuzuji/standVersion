package com.szsoft.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.szsoft.service.DemoService;


@Controller	
@RequestMapping(value="/demo")
public class DemoController {
	
	@Resource
	DemoService demoSercie;
	
	/**
	 * demo
	 * @param model
	 * @param request
	 * @param tRegistOrderCondition
	 * @return
	 */
	@RequestMapping(value="/demotest")
	@ResponseBody
	public  String getEicrFormInfo(){
		
		String str = demoSercie.DemoTest();
		System.out.println(str);
		return str;
	}

}
