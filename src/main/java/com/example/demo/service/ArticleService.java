package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Article;

@Service
public class ArticleService {
	public static ArrayList<Article> articleList = new ArrayList();

	public ArticleService() {
		for (int i = 1; i <= 10; i++) {
			Article articles = new Article(i, "제목" + i, "내용" + i);
			articleList.add(articles);
		}
	}

	public static Article search(int id) {
		for (int i = 0; i < articleList.size(); i++) {
			if (articleList.get(i).id == id) {
				return articleList.get(i);
			}
		}
		return null;
	}

}
