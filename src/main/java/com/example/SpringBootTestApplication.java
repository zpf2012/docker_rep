package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用application.properties文件，可以配置一些参数 ，在这里使用{@value}标签进行引用
 * @author zhangpengfei
 *
 */
@RestController
@SpringBootApplication
public class SpringBootTestApplication {
	
	@Value("${book.name}")
	private String bookName;
	
	@Value("${book.author}")
	private String bookAuthor;
	
	@RequestMapping("/")
	public String index(){
		setBookAuthor("xiaofeifei");
		
		return "Book'name is "+ bookName + " and author is "+bookAuthor;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
}
