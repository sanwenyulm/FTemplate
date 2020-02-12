package com.sanwenyu.comment.controler;


import com.sanwenyu.comment.pojo.Comment;
import com.sanwenyu.comment.service.CommentService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/comment")
public class CommentControler {
    @Autowired
    private CommentService commentService;

    /*** 查询全部数据 * @return */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, StatusCode.OK, "查询成功", commentService.findAll());
    }

    /*** 根据ID查询 * @param id ID * @return */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findOne(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功", commentService.findById(id));
    }

    /*** 增加 * @param spit */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Comment comment) {
        commentService.add(comment);
        return new Result(true, StatusCode.OK, "增加成功");
    }

    /**
     * 修改 * @param spit
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Result update(@RequestBody Comment comment, @PathVariable String id) {
        comment.set_id(id);
        commentService.update(comment);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /*** 删除 * @param id */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id) {
        commentService.deleteById(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }


    /*** 根据上级评论查询子评论 分页*/
    @RequestMapping(value = "/childcomment/{parentid}/{page}/{size}", method = RequestMethod.GET)
    public Result childcomment(@PathVariable String parentid,@PathVariable int page,@PathVariable int size) {
        System.out.println("childcomment2");
        Page<Comment> commentPage = commentService.childcomment(parentid,page,size);
        return new Result(true, StatusCode.OK, "查询成功",new PageResult<Comment>(commentPage.getTotalElements(),commentPage.getContent()));
    }

    /*** 吐槽点赞*/
    @RequestMapping(value = "/thumbup/{commentId}", method = RequestMethod.PUT)
    public Result thumbupComment(@PathVariable String commentId) {
        commentService.thumbupComment(commentId);
        return new Result(true, StatusCode.OK, "点赞成功");
    }
}