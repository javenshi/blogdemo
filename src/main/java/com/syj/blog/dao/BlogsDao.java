package com.syj.blog.dao;

import com.syj.blog.entity.Blogs;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class BlogsDao extends SqlSessionDaoSupport {

    public List<Blogs> findAll(){
        return null;
    }



}
