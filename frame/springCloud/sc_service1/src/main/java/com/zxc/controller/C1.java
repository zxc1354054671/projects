package com.zxc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C1 {
	@Value("${server.port}")
	private String serverPort;
	
	@RequestMapping("/getList")
	public List<String> getList(){
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("我");
		al.add("饿");
		al.add("serverPort:"+serverPort);
		return al;
	}
}
