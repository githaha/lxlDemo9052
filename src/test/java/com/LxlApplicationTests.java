package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = LxlApplication.class)
//@AutoConfigureMockMvc
public class LxlApplicationTests {

    @Autowired
    private MockMvc mvc;


    public void getHello() throws Exception {
        String urlStr = "http://localhost:8080/haha";
      MvcResult result = mvc.perform(MockMvcRequestBuilders.get(urlStr).accept(MediaType.APPLICATION_JSON))
                .andReturn();
        MockHttpServletResponse response = result.getResponse();
        //拿到返回码
        int status = response.getStatus();
        //拿到结果
        String contentAsString = response.getContentAsString();
        System.out.println("---------status:"+status+"content:"+contentAsString);


    }















}
