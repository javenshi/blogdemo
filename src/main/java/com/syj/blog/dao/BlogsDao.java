package com.syj.blog.dao;

import com.syj.blog.entity.Blogs;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BlogsDao  {

    public List<Blogs> findAll();



}
