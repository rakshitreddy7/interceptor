package com.rakshit.interceptor.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GeneralPurposeInterceptor implements HandlerInterceptor {

    private final Logger LOG = LoggerFactory.getLogger(GeneralPurposeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("In prehandle() of GeneralPurposeInterceptor");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("In posthandle() of GeneralPurposeInterceptor");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("In afterCompletion() of GeneralPurposeInterceptor");
    }
}


/*
*   1. PreHandle : a. Happens before a request reaches a handler. (handler in this context is simply a controller)
*                  b. If this returns "false", then this is the last point of the request, meaning it won't go till the controller.
*
*
*   2. PostHandle : Happens once the controller has served the request.
*
*   3. afterCompletion: a. If your controller also renders a view like a JSP view, then afterCompletion will come into picture after the view is rendered.
*                       b. Meaning, after the model is injected into the view.
*
* */