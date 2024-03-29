package com.configs;

import com.interceptors.OneInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置拦截器---加载拦截器
 * */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        拦截按照顺序执行
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/data/**");
        super.addInterceptors(registry);
    }
}
