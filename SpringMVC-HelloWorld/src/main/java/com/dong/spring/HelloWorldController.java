package com.dong.spring;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{
	
	private String helloWorld;
	private String viewPage;
	
	/*
	 * Handle
	 */
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res){
		Map<String, String> model = new HashMap<String, String>();
		model.put("helloWorld", getHelloWorld());
		return new ModelAndView(getViewPage(), model);
	}
	
	/*
	 * Set and Gett
	 */
	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getViewPage() {
		return viewPage;
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
}
