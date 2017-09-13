package com.springmvc.jpa.controllers;

import com.springmvc.jpa.model.BlogEntity;
import com.springmvc.jpa.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/13 0013 10:44
 */
@RestController
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(value = "/findBlogByTitle" ,produces = "application/json;charset=utf-8")
    public String FindBlogByTitle(String title){
        BlogEntity blog = blogRepository.findBlogEntityByTitle(title);
        return blog.toString();
    }
}
