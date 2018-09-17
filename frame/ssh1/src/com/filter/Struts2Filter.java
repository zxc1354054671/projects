package com.filter;

import javax.servlet.annotation.WebFilter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
@WebFilter("/*")
public class Struts2Filter extends StrutsPrepareAndExecuteFilter {

}
