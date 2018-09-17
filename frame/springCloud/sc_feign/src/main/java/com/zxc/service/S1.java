package com.zxc.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="service")
public interface S1 {

	@RequestMapping("/getList")
	public List<String> getList();
}
