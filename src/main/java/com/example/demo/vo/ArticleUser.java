package com.example.demo.vo;

import java.util.ArrayList;

public class ArticleUser {
	public static ArrayList<Article> articleList = new ArrayList();

	public ArticleUser() {
		for (int i = 1; i <= 10; i++) {
			Article articles = new Article(i, "제목" + i, "내용" + i);
			articleList.add(articles);
		}
	}

	public Article search(int id) {
		for (int i = 0; i < articleList.size(); i++) {
			if (articleList.get(i).id == id) {
				return articleList.get(i);
			}
		}
		return null;
	}

}
