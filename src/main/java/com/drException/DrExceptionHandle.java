package com.drException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class DrExceptionHandle {

    public static final String ERROE_VIEW = "errorD";
//    如果不指定 错误页面，Spring 就会调用内置的error页面返回
    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();
        System.out.println("执行异常-----");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(ERROE_VIEW);
        return mav;
    }


}
