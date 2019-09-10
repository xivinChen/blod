package com.blod.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blod.entity.Article;
import com.blod.entity.User;
import com.blod.service.ArticleService;
import com.blod.utils.BlodResult;
import com.blod.utils.DateUtils;
import com.blod.utils.PageData;

@Controller
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	/**
	 * 通过article查找文章接口
	 * @param article
	 * @param model
	 * @return
	 */
	@RequestMapping("/list") 
	public String getArticles(@RequestParam(value="page",defaultValue="1") Integer page,@RequestParam(value="rows",defaultValue="5") Integer rows,Model model) {
		Article article=new Article();
		System.out.println(page);
		PageData articles= articleService.getArticles(page,rows);
		model.addAttribute("articlelist", articles);
		return "main";
	}
	
	/**
	 * 查询文章列表并返回json格式接口
	 * @return
	 */
	@RequestMapping("/jsonlist") 
	@ResponseBody
	public PageData getArticlesJson(@RequestParam(value="page",defaultValue="1") Integer page,@RequestParam(value="rows",defaultValue="5") Integer rows) {
		Article article=new Article();
		PageData articles= articleService.getArticles(page,rows);
		//model.addAttribute("articlelist", articles);
		return articles;
	}
	
	@RequestMapping("/id") 
	public String getArticles(Integer artId,Model model) {
		Article article= articleService.getArticleById(artId);
		model.addAttribute("article", article);
		return "article";
	}
	
	@RequestMapping("/idjson") 
	@ResponseBody
	public Article getArticlesJson(Integer artId) {
		return articleService.getArticleById(artId);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public BlodResult addArticle(Article article,HttpServletRequest request) {
		
		try {
			System.out.println("文章内容为："+article.getArtContent());
			User user=(User) request.getSession().getAttribute("user");
			article.setArtDate(DateUtils.dateformatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			article.setArtUsername(user.getUsUsername());
			article.setArtReadnumber(0);
			article.setArtDianzan(0);
			articleService.addArticle(article);
			return BlodResult.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return BlodResult.build(119, "新增失败");
		}
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public BlodResult delArticle(Integer artId) {
		
		try {
			
			articleService.delArticle(artId);
			return BlodResult.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return BlodResult.build(119, "删除失败");
		}
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public BlodResult updateArticle(Article article,HttpServletRequest request) {
		
		try {
			User user=(User) request.getSession().getAttribute("user");
			//article.setArtDate(DateUtils.dateformatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			article.setArtUsername(user.getUsUsername());
			articleService.updateArticle(article);
			return BlodResult.ok();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return BlodResult.build(119, "删除失败");
		}
	}

}
