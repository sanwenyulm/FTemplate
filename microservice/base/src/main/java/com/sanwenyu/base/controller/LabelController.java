package com.sanwenyu.base.controller;

import com.sanwenyu.base.pojo.Label;
import com.sanwenyu.base.service.LabelService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/label")
@RefreshScope
public class LabelController {
    @Value("${sms.ip}")
    private String ip;
    @Autowired
    LabelService labelService;
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        System.out.println(ip);
        return new Result(true, StatusCode.OK,"查询成功", labelService.findAll());
    }
    @RequestMapping(value = "/{labelId}",method = RequestMethod.GET)
    public Result findById(@PathVariable("labelId") String labelId){
        return new Result(true, StatusCode.OK,"查询成功", labelService.findById(labelId));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK,"存储成功");
    }
    @RequestMapping(value = "/{labelId}",method = RequestMethod.PUT)
    public Result update(@PathVariable("labelId") String labelId,@RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true, StatusCode.OK,"更新成功");
    }
    @RequestMapping(value = "/{labelId}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable("labelId") String labelId){
        labelService.deleteById(labelId);
        return new Result(true, StatusCode.OK,"删除成功");
    }
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public Result findSearch(@RequestBody Label label){
        return new Result(true, StatusCode.OK,"查找成功",labelService.findSearch(label));
    }
    @RequestMapping(value = "/search/{page}/{size}",method = RequestMethod.POST)
    public Result findSearchByPage(@PathVariable("page") int page,@PathVariable("size") int size,@RequestBody Label label){
        Page<Label> pages = labelService.findSearchByPage(page,size,label);
        //分页返回用PageResult封装 ：total是总的搜索结果数，rows是符合搜索结果的当前页
        return new Result(true, StatusCode.OK,"查找成功",new PageResult<Label>(pages.getTotalElements(),pages.getContent()));
    }
    @RequestMapping(value = "/search/recommand",method = RequestMethod.GET)
    public Result findRecommands(){
        return new Result(true, StatusCode.OK,"查找成功",labelService.recommandLabel());
    }
}
