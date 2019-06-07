package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.IMoocJSONResult;
import com.pojo.DrResource;
import com.pojo.MmallUser;
import com.pojo.User;
import com.service.UserService;
import com.tasks.AsyncTask;
import com.tasks.TaskTest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/****
 * 1:@ResponseBody,表示这个controller方法返回方法里的Return数据,而无法返回html,jsp页面；
 * 2:@Controller,调用返回方法里的相对资源路径，返回的html,
 * 1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，
 * 配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
 * 2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
 */
//@RestController==@Controller+@ResponseBody;
@RestController()
@RequestMapping("/data")
public class HelloController {

    @Autowired
    private DrResource resourceN;

    @Autowired
    private AsyncTask taskTest;

    @Autowired
    private UserService userService;

    @RequestMapping("/world")
    public String[] index() {
        String[] list = new String[4];
        list[0] = "1";
        list[1] = "2";
        list[2] = "3";
        list[3] = "3";
        return list;
    }
    @RequestMapping("/getAllUser")
    public Object getUser(){
        PageHelper.startPage(1,2);
        List<MmallUser> listUser = userService.selectAll();
        PageInfo<MmallUser> pageInfo = new PageInfo<>(listUser);

        return pageInfo;
    }
    @RequestMapping("/addUser")
    public IMoocJSONResult getUserJson(){
        Date creatDate = new Date();
        MmallUser user = new MmallUser(1,"zansan","password","449299203@qq.com","18516501877","你是谁","我是哈哈",13,creatDate,creatDate);
        return IMoocJSONResult.ok(userService.insert(user));

    }
    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){

        System.out.println(resourceN);
        DrResource resource = new DrResource();
        //不能直接返回resourceN，因为此对象是Bean，Json无法解析
        BeanUtils.copyProperties(resourceN,resource);
        return IMoocJSONResult.ok(resource);
    }
    @RequestMapping("/doAsync")
    public String AsyncTest() throws Exception{

        long start = System.currentTimeMillis();
        Future<Boolean> a = taskTest.doTask11();
        Future<Boolean> b = taskTest.doTask12();
        Future<Boolean> c = taskTest.doTask13();
        Future<Boolean> d = taskTest.doTask14();
        while (!a.isDone()|| !b.isDone() || !c.isDone() || !d.isDone()){
            if(a.isDone()&& b.isDone() && c.isDone() && d.isDone()){
                break;
            }
        }

        long end = System.currentTimeMillis();

        return "任务全部完成时间："+(end - start) + "毫秒";
    }
}
