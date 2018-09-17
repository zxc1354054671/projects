package com.zxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zxc.service.S1;

@RestController
public class C1 {
	@Autowired
	private S1 s1;
	
	@RequestMapping("/getList")
	public List<String> getList(){
		System.out.println("f s");
		return s1.getList();
	}
}
