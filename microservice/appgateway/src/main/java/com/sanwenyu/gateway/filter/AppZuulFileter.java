package com.sanwenyu.gateway.filter;

import Constants.Constant;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import util.JwtUtil;

import javax.servlet.http.HttpServletRequest;

@Component
public class AppZuulFileter extends ZuulFilter {
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public String filterType() {//过滤器类型

        return "pre";//前置过滤器

    }

    @Override
    public int filterOrder() {
        return 0;//优先级，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;//过滤器开关，true表示开启
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("网站过滤器");
        String responseStr = "无权访问";
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        if (request.getMethod().equals("OPTIONS")) {//不拦截该方法http
            //放行请求
            return null;
        }


        String url = request.getRequestURL().toString();
        if (url.indexOf("login") > 0 || url.indexOf("register") > 0) {//登陆请求
            //放行请求
            return null;
        }

        String authHeader = (String) request.getHeader(Constant.REQUEST_HEADER_ATTR);// 获取头信息

        if (authHeader != null && authHeader.startsWith(Constant.TOKRN_PREFIX)) {
            String token = authHeader.substring(Constant.TOKRN_SUBSTRING);


            try {
                Claims claims = jwtUtil.parseJWT(token);
                if (claims != null) {
                    String role = (String) claims.get(Constant.AUTH_ROLES);
                    if (role != null) {
                        if (role.equals(Constant.AUTH_ADMIN) || role.equals(Constant.AUTH_USER)) {
                            requestContext.addZuulRequestHeader(Constant.AUTH_ROLES,role);
                            requestContext.addZuulRequestHeader(Constant.TOKRN_USER_ID,claims.getId());
                            //放行请求
                            return null;
                        }
                    }
                }
            } catch (Exception e) {
                responseStr = "令牌超期!";
            }
        }

        requestContext.setSendZuulResponse(false);//终止运行
        requestContext.setResponseStatusCode(401);//http状态码
        requestContext.setResponseBody(responseStr);
        requestContext.getResponse().setContentType("text/html;charset=UTF-8");
        return null;
    }
}