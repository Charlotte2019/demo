package com.abyss.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mayn
 */
public class MyHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        //未登录，返回登录页面
        if (username == null) {
            request.setAttribute("msg", "没有权限,请先登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {//登录，放行
            return true;
        }
    }
}
