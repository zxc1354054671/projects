package com.zxc.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * 验证token
 * 
 * @author Administrator
 *
 */
public class Filter0 extends ZuulFilter {
	private static Logger log = LoggerFactory.getLogger(Filter0.class);

	@Override
	public Object run() throws ZuulException {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		//request url
		log.info(String.format("%s >>> %s", request.getMethod(), request
				.getRequestURL().toString()));
		String token = request.getParameter("token");
		log.warn("token = "+token);
		if (null != token) {
			return null;
		}
		context.setSendZuulResponse(false);
		context.setResponseStatusCode(401);
		try {
			context.getResponse().getWriter().write("token = "+token);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * 返回一个boolean类型来判断该过滤器是否要执行。我们可以通过此方法来指定过滤器的有效范围。
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/*
	 * 通过int值来定义过滤器的执行顺序，数值越小优先级越高
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/*
	 * pre：可以在请求被路由之前调用。 routing：在路由请求时候被调用。 post：在routing和error过滤器之后被调用。
	 * error：处理请求时发生错误时被调用。
	 */
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

}
