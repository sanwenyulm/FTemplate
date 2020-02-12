package com.sanwenyu.article.controller;

import com.sanwenyu.article.pojo.Comment;
import com.sanwenyu.article.service.CommentService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/article/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Comment comment) {
        commentService.add(comment);
        return new Result(true, StatusCode.OK, "提交成功 ");
    }
    @RequestMapping(value = "/{articleId}/{page}/{size}",method = RequestMethod.GET)
    public Result findCommentByArticleId(@PathVariable String articleId,@PathVariable int page,@PathVariable int size) {
        Page<Comment> commentPage = commentService.articleComment(articleId,page,size);
        return new Result(true, StatusCode.OK, "查询成功 ",new PageResult<Comment>(commentPage.getTotalElements(),commentPage.getContent()));
    }
    @RequestMapping(value = "/child/{parentId}/{page}/{size}",method = RequestMethod.GET)
    public Result childcomment(@PathVariable String parentId,@PathVariable int page,@PathVariable int size){
        Page<Comment> commentPage =  commentService.childcomment(parentId,page,size);
        return new Result(true, StatusCode.OK, "查询成功 ",new PageResult<Comment>(commentPage.getTotalElements(),commentPage.getContent()));
    }
}
