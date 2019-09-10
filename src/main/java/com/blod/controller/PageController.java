package com.blod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面控制器
 * @author Administrator
 *
 */
@Controller
public class PageController {
	
	@RequestMapping("/")
	private String showIndex() {
		return "index";
	}
	
	//显示页面方法
	@RequestMapping("/{page}")
	private String showPage(@PathVariable String page) {
		System.out.println("当前页面："+page);
		return page;
	}
	
	@RequestMapping("admin/{page}")
	private String showadloginPage(@PathVariable String page) {
		return "admin/"+page;
	}
	
	@RequestMapping("/admin/update-article")
	public String showArticleUpadte(Integer artId) {
		
		return "admin/update-article";
	}
	
	

}
