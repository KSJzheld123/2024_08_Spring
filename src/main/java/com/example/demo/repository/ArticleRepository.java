package com.example.demo.repository;

import com.example.demo.vo.Article;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.service.ArticleService;
@Mapper
public interface ArticleRepository {

	
	@Insert("INSERT INTO article SET regDate() = NOW, updateDate = NOW(), title = #{title}, `body` =  #{body}")
	public String add(String title, String body);

	
	@Delete("DELETE FROM article WHERE id = #{id}")
	public String delete(int id);
	
	
	@Update("article SET updateDate = NOW(), title = #{title}, body = #{body} WHERE id = #{id}")
	public String modify(int id, String title, String body);

	
	@Select("SELECT * FROM article WHERE id = #{id}")
	public Object detail(int id);
	
	
	@Select("SELECT * FROM article ORDER BY id DESC;")
	public ArrayList<Article> list();
	
	
}