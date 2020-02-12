package com.sanwenyu.article.service;

import com.sanwenyu.article.dao.CommentDao;
import com.sanwenyu.article.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.Date;

@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private IdWorker idWorker;

    @Autowired
    private ArticleService articleService;
    public void add(Comment comment) {
        comment.set_id(idWorker.nextId() + "");
        comment.setPublishdate(new Date());

        commentDao.save(comment);
        //使文章评论数增加
        articleService.articleCommentAdd(comment.getArticleid());
    }

    public Page<Comment> articleComment(String articleId, int page, int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return commentDao.findByArticleid(articleId, pageable);
    }

    public Page<Comment> childcomment(String parentId, int page, int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return commentDao.findByParentid(parentId, pageable);
    }
}
