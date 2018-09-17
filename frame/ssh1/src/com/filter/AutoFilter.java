package com.filter;

import javax.servlet.annotation.WebFilter;

import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;

@WebFilter("/*")
public class AutoFilter extends OpenSessionInViewFilter {

}
