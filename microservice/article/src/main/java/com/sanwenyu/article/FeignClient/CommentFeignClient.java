package com.sanwenyu.article.FeignClient;

import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "microservice-comment",fallback = CommentFeignClientImpl.class)
public interface CommentFeignClient {
    @RequestMapping(value = "/comment/childcomment/{parentid}/{page}/{size}", method = RequestMethod.GET)
    public Result childcomment(@PathVariable("parentid") String parentid, @PathVariable("page")  int page, @PathVariable("size") int size);
}
