package com.ll.deploy231219;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@Controller
public class Deploy231219Application {
    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(Deploy231219Application.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "메인 젠킨스 빌드 테스트1";
    }

    @GetMapping("/new")
    @ResponseBody
    public Article newArticle() {
        Article article = Article.builder()
                .title("ss")

                .build();

        articleRepository.save(article);

        return article;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Article> articles() {
        return articleRepository.findAll();
    }
}