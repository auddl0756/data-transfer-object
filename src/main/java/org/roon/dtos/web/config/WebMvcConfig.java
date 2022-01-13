package org.roon.dtos.web.config;

import org.roon.dtos.web.interceptor.RequestParamInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestParamInterceptor());
    }

    @Bean
    public RequestParamInterceptor requestParamInterceptor(){
        return new RequestParamInterceptor();
    }
}
