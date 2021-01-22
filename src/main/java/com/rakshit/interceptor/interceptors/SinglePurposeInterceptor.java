package com.rakshit.interceptor.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SinglePurposeInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(SinglePurposeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("In prehandle() of SinglePurposeInterceptor");

        LOG.info("URI " + request.getRequestURI());
        LOG.info("URL " + request.getRequestURL());     // Interceptors (Spring concept) are powerful than filters (Servlet concept), since you have to access to the request & can make use of it.

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("In postHandle() of SinglePurposeInterceptor");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("In afterCompletion() of SinglePurposeInterceptor");
    }
}
