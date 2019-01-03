package zjy.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjy.article.fegin.ApiServer;
import zjy.article.fegin.UserApiService;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author z845944350
 * @Date 2018/12/29 10:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ApiServer service;

    @GetMapping("/{id}")
    public String getArticleById(@PathVariable("id")Long id){
        String userById = service.getUserById(id);
        return userById+"     得到ID为"+id+"的文章";
    }
}
