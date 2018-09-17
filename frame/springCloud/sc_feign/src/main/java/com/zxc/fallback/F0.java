package com.zxc.fallback;

import java.util.ArrayList;
import java.util.List;

import com.zxc.service.S1;

public class F0 implements S1 {

	@Override
	public List<String> getList() {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("feign fallback 服务器异常");
		return al;
	}
	
}
