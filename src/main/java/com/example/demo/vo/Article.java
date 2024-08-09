package com.example.demo.vo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	int id;
	String title;
	String body;
}
