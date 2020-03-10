package net.ukr.tigor.Test.API.News.controller;

import net.ukr.tigor.Test.API.News.domain.Example;
import net.ukr.tigor.Test.API.News.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("articles")
public class RestController {
    @Autowired
    ArticleService articleService;
    @GetMapping
    public Example articles(){
        Example example = articleService.getExample();

        return example;
    }
}
