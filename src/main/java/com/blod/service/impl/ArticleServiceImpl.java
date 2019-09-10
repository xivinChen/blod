package com.blod.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blod.entity.Article;
import com.blod.entity.ArticleExample;
import com.blod.mapper.ArticleMapper;
import com.blod.service.ArticleService;
import com.blod.utils.PageData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public PageData getArticles(Integer page,Integer rows) {
		// TODO Auto-generated method stub
		PageData result=new PageData();
		PageHelper.startPage(page, rows);
		ArticleExample example=new ArticleExample();
		List<Article> list = articleMapper.selectByExample(example);
		PageInfo<Article> info=new PageInfo<Article>(list);
		result.setTotal(info.getTotal());
		result.setList(list);
		result.setPage(page);
		result.setRows(rows);
		result.setPagetotal();
		
		return result;
	}
	
	@Override
	public Article getArticleById(Integer artId) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(artId);
	}

	@Override
	public void addArticle(Article article) {
		// TODO Auto-generated method stub
		articleMapper.insert(article);
		
	}

	@Override
	public void delArticle(Integer artId) {
		// TODO Auto-generated method stub
		articleMapper.deleteByPrimaryKey(artId);
		//System.out.println("删除了："+artId);
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleMapper.updateByPrimaryKeySelective(article);
		//articleMapper.updateByPrimaryKeyWithBLOBs(article);
		
	}

}
