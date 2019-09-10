package com.blod.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blod.entity.Articlecategory;
import com.blod.entity.ArticlecategoryExample;
import com.blod.mapper.ArticlecategoryMapper;
import com.blod.service.CatagoryService;

@Service
public class CatagorySerivceImpl implements CatagoryService{

	@Autowired
	private ArticlecategoryMapper articlecategoryMapper;
	
	@Override
	public List<Articlecategory> getCatagories() {
		// TODO 查询所有的分类
		ArticlecategoryExample example=new ArticlecategoryExample();
		return articlecategoryMapper.selectByExample(example);
	}

	@Override
	public Articlecategory getCatagoryById(Integer ctgId) {
		
		return articlecategoryMapper.selectByPrimaryKey(ctgId);
	}

}
