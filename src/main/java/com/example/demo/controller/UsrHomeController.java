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
	public String deleteArticles(int id) {

		Article article = AU.search(id);

		if (article == null) {
			return id + "번 게시글은 없습니다";
		} else {
			AU.articleList.remove(article);
			return id + "번 게시글 삭제";
		}
	}

	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public String modifyArticles(int id, String title, String body) {

		Article article = AU.search(id);

		if (article == null) {
			return id + "번 게시글은 없습니다";
		} else {
			String beforeTitle = AU.articleList.get(id - 1).getTitle();
			String beforeBody = AU.articleList.get(id - 1).getBody();
			AU.articleList.get(id - 1).setTitle(title);
			AU.articleList.get(id - 1).setBody(body);
			return id + "번 게시글 수정 / " + "수정 전 제목 : " + beforeTitle + " 수정 전 내용 : " + beforeBody + " / " + "수정 후 제목 : "
					+ AU.articleList.get(id - 1).getTitle() + " 수정 후 내용 : " + AU.articleList.get(id - 1).getBody();
		}
	}

}
