package com.sanwenyu.article.dao;


import com.sanwenyu.article.pojo.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentDao extends MongoRepository<Comment, String> {
    public Page<Comment> findByParentid(String parentid, Pageable pageable);
    public Page<Comment> findByArticleid(String articleid, Pageable pageable);

}
