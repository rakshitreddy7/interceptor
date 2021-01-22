package com.rakshit.interceptor.configs;

import com.rakshit.interceptor.interceptors.GeneralPurposeInterceptor;
import com.rakshit.interceptor.interceptors.SinglePurposeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new GeneralPurposeInterceptor()).order(2);
        registry.addInterceptor(new SinglePurposeInterceptor()).addPathPatterns("/products/**").order(1);
    }
}
