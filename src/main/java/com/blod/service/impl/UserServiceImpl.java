package com.blod.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blod.entity.User;
import com.blod.entity.UserExample;
import com.blod.mapper.UserMapper;
import com.blod.service.UserService;
import com.blod.utils.MD5Utils;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getAllUser(User tbUser) {
		// TODO Auto-generated method stub
		UserExample example=new UserExample();
		
		return userMapper.selectByExample(example);
	}

	@Override
	public User getUserByUsername(String username, String password){
		// TODO Auto-generated method stub
		//User tbUser=new User();
		//tbUser.setUsUsername(username);
		User user=userMapper.selectByPrimaryKey(username);
		if(user!=null) {
			/*String md=MD5Utils.md5(password);
			String md1=user.getUsPassword();
			System.out.println(md);
			System.out.println(md1);*/
			if(MD5Utils.md5(password).equals(user.getUsPassword())) {
				
				return user;
			}
			return null;
		}
		else{
			return null;
		}
		
	}

}

