package com.sanwenyu.user.interceptor;

import Constants.Constant;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import util.JwtUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@Component  不再单独过滤 统一交给路由服务过滤
public class JwtInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String header = request.getHeader(Constant.REQUEST_HEADER_ATTR);
        if(header != null && !"".equals(header)){
            //app 端约定必须以Constant.TOKRN_PREFIX开头
            if(header.startsWith(Constant.TOKRN_PREFIX)){
                String token = header.substring(Constant.TOKRN_SUBSTRING);
                try{
                    Claims claims = jwtUtil.parseJWT(token);
                    String role = (String) claims.get(Constant.AUTH_ROLES);
                    if(role != null){
                        if(role.equals(Constant.AUTH_ADMIN) || role.equals(Constant.AUTH_USER)){
                            request.setAttribute(Constant.AUTH_TOKRN,claims);
                            //放行请求
                            return true;
                        }
                    }
                }catch (Exception e){
                    throw new RuntimeException("令牌超期!");
                }
            }
        }
        //没有token 不允许访问网站资源
        throw new RuntimeException("无权访问服务资源!");
    }
}
