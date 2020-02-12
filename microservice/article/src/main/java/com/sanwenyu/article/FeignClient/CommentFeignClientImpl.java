package com.sanwenyu.article.FeignClient;

import entity.Result;
import entity.StatusCode;
import org.springframework.stereotype.Component;

@Component
public class CommentFeignClientImpl implements CommentFeignClient {
    @Override
    public Result childcomment(String parentid, int page, int size) {
        return new Result(false, StatusCode.ERROR,"熔断器生效");
    }
}
