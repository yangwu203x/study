package com.springmvc.jpa.repository;

import com.springmvc.jpa.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author leo_Yang【音特】
 * @Date 2017/9/13 0013 10:41
 */
@Repository
public interface BlogRepository  extends JpaRepository<BlogEntity,Integer>{
    BlogEntity findBlogEntityByTitle(String title);
}
