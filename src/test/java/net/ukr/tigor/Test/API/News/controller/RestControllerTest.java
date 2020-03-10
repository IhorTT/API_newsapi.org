package net.ukr.tigor.Test.API.News.controller;

import net.ukr.tigor.Test.API.News.domain.Example;
import net.ukr.tigor.Test.API.News.service.ArticleService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class RestControllerTest {
    ArticleService articleService = new ArticleService();
    Example example = null;

    @BeforeEach
    public void initTest() {
        example = articleService.getExample();
    }

    @AfterEach
    public void afterTest() {
        example = null;
    }
    @Test
    void articles() {
        System.out.println(example.getTotalResults());
        assertFalse(example.getTotalResults()<5);
     }
}