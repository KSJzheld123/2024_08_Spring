package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;
import com.example.demo.vo.ArticleUser;

@Controller
public class UsrHomeController {

	int lastId = 10;
	ArticleUser AU = new ArticleUser();

	@RequestMapping("/usr/article/add")
	@ResponseBody
	public String setArticles(String title, String body) {
		Article article = new Article((lastId + 1), title, body);
		AU.articleList.add(article);
		lastId++;
		return lastId + "번 게시글 생성";
	}

	@RequestMapping("/usr/article/get")
	@ResponseBody
	public ArrayList<Article> getArticles() {

		return AU.articleList;
	}

	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String setArticles(int id) {

		AU.articleList.remove(id - 1);

		return id + "번 게시글 삭제";
	}

	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public String setArticles(int id, String title, String body) {

		AU.articleList.get(id - 1).setTitle(title);
		AU.articleList.get(id - 1).setBody(body);
		return id + "번 게시글 수정";
	}

}
