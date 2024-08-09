package com.example.demo.vo;

import java.util.ArrayList;

public class ArticleUser {
	public static ArrayList<Article> articleList = new ArrayList();
	public static int lastId = 10;

	public ArticleUser() {
		for (int i = 1; i <= 10; i++) {
			Article articles = new Article(i, "제목" + i, "내용" + i);
			articleList.add(articles);
		}
	}
}
