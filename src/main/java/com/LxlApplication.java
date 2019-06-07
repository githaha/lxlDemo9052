package com;

import com.controller.JavaProxyDemo.*;
import com.controller.JavaProxyDemo.ProxyDynamic.StudentHandle;
import com.controller.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import tk.mybatis.spring.annotation.MapperScan;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@SpringBootApplication(scanBasePackages = {"com"})
@MapperScan(basePackages = "com.mapper")
@EnableScheduling
@EnableAsync
@EnableWebMvc
public class LxlApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(LxlApplication.class, args);

    }




}
