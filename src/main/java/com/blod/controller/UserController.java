package com.blod.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blod.entity.User;
import com.blod.service.UserService;
import com.blod.utils.BlodResult;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/list")
	public List<User> getAllUser(User tbUser) {
		
		return userService.getAllUser(tbUser);
		
	}
	
	/**
	 * 用户登录接口
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public BlodResult userLogin(String usUsername,String usPassword,HttpServletRequest request) {
		try {
			System.out.println(usUsername+usPassword);
			User user=userService.getUserByUsername(usUsername,usPassword);
			if(user==null)
				return BlodResult.build(119,"用户名或密码错误");
			else {
				
			
			System.out.println(user.getUsUsername());
			request.getSession().setAttribute("user", user);
			return BlodResult.ok();
			}
		} catch (Exception e) {
			return BlodResult.build(119, e.getMessage());
		}
	}
	
	/**
	 * 用户退出登录
	 * 
	 */
	@RequestMapping("/logout")
	@ResponseBody
	public BlodResult userLogout(HttpServletRequest request) {
		
		try {
			System.out.println("退出成功");
			request.getSession().removeAttribute("user");
			return BlodResult.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return BlodResult.build(119, "未知错误");
		}
	}

}
