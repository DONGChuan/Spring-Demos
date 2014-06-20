package com.dong.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class HelloWorldController extends SimpleFormController {
	
	private String viewPage;
	
	public ModelAndView onSubmit(Object command) {
		HelloWorld helloWorld =(HelloWorld) command;
		Map<String, String> model = new HashMap<String, String>();
		model.put("helloWorld", helloWorld.getMsg());
		return new ModelAndView(getViewPage(),model);
	}
	
	/*
	 * Set and Get
	 */
	public String getViewPage() {
		return viewPage;
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	
}
