package com.sanwenyu.comment.service;

import com.sanwenyu.comment.dao.CommentDao;
import com.sanwenyu.comment.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import util.IdWorker;

import java.util.Date;
import java.util.List;


@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;
    @Autowired
    private IdWorker idWorker;

    @Autowired
    private MongoTemplate mongoTemplate;

    /*** 查询全部记录 * @return */
    public List<Comment> findAll() {
        return commentDao.findAll();
    }

    /*** 根据主键查询实体 * @param id * @return */
    public Comment findById(String id) {
        Comment comment = commentDao.findById(id).get();
        if (comment != null) {
            //增加浏览量
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(id));
            Update update = new Update();
            update.inc("visits", 1);
            mongoTemplate.updateFirst(query, update, "comment");
        }
        return comment;
    }

    /*** 增加 * @param Conment */
    public void add(Comment comment) {
        comment.set_id(idWorker.nextId() + ""); //主键值
        comment.setPublishtime(new Date());//发布日期
        comment.setVisits(0);//浏览量
        comment.setShare(0);//分享数
        comment.setThumbup(0);//点赞数
        comment.setComment(0);//回复数
        comment.setState("1");//状态
        if (comment.getParentid() != null && !"".equals(comment.getParentid())) {
            //如果存在上级ID, 评论数目加一
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(comment.getParentid()));
            Update update = new Update();
            update.inc("comment", 1);
            mongoTemplate.updateFirst(query, update, "comment");
        }
        commentDao.save(comment);
    }

    /*** 修改 * @param Conment */
    public void update(Comment comment) {
        commentDao.save(comment);
    }

    /*** 删除 * @param id */
    public void deleteById(String id) {
        commentDao.deleteById(id);
    }

    /**
     * 分页获取子评论
     *
     * @param parentid
     * @param page
     * @param size
     * @return
     */
    public Page<Comment> childcomment(String parentid, int page, int size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return commentDao.findByParentid(parentid, pageable);
    }

    /**
     * 点赞 采用mongo 自增操作支持
     * 不使用查出来 增加 再保存
     *
     * @param commentId
     */
    public void thumbupComment(String commentId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(commentId));
        Update update = new Update();
        update.inc("thumbup", 1);
        mongoTemplate.updateFirst(query, update, "comment");
    }
}