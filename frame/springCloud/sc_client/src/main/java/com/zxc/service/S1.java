package com.zxc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class S1 {
	@Autowired
	//rest用的少，用feign
	private RestTemplate rt;
	
	/**调用service服务
	 * @return
	 */
	public List<String> getList(){
		return rt.getForObject("http://service/getList", List.class);
	}
	
	public List<String> clientError(){
		List<String> al = new ArrayList<String>();
		al.add("not client list?");
		return al;
	}
	
}
