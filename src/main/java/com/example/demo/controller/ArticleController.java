package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.repository.ArticleRepository;
import com.example.demo.vo.Article;
import com.example.demo.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired

	ArticleRepository articleRepository;
	ArticleService articleService;

	@RequestMapping("/usr/article/add")
	@ResponseBody
	public String setArticles(String title, String body) {
		return articleRepository.add(title, body);
	}

	@RequestMapping("/usr/article/get")
	@ResponseBody
	public ArrayList<Article> getArticles() {
		return articleService.articleList;
	}

	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String deleteArticles(int id) {
		return articleRepository.delete(id);
	}

	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public String modifyArticles(int id, String title, String body) {
		return articleRepository.modify(id, title, body);
	}

	@RequestMapping("/usr/article/doDetail")
	@ResponseBody
	public Object detailArticles(int id) {
		return articleRepository.detail(id);
	}

}
