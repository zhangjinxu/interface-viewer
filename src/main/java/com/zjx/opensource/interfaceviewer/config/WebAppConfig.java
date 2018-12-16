package com.zjx.opensource.interfaceviewer.config;

import com.zjx.opensource.interfaceviewer.controller.aop.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/login**").excludePathPatterns("/logout**").excludePathPatterns("/register**")
//                .excludePathPatterns("/projects").excludePathPatterns("/lib**").excludePathPatterns("/static**")
//                .excludePathPatterns("/**.html");
    }
}
