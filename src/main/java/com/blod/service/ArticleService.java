package com.blod.service;

import java.util.List;

import com.blod.entity.Article;
import com.blod.utils.PageData;

public interface ArticleService {

	PageData getArticles(Integer page,Integer rows);

	Article getArticleById(Integer artId);

	void addArticle(Article article);

	void delArticle(Integer artId);

	void updateArticle(Article article);

}
