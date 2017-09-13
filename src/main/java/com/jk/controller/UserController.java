package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.service.IUserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController extends BaseController{

    @Autowired
     private IUserService userService;

    @RequestMapping("/ListUser")
     public void  ListUser(HttpServletResponse response) throws Exception {
        List<User> userList = userService.userList();
        jsonOut(userList,response);

    }

    /**
     * 删除的方法
     * @param user
     * @param response
     */
    @RequestMapping("/deleteUser")
     public void deleteUser(User user,HttpServletResponse response){
         try {
             userService.deleteUser(user);
             jsonOutSuccess(response);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

    /**
     * 新增的方法
     * @param user
     * @param response
     */
     @RequestMapping("/addUser")
     public void  addUser(User user,HttpServletResponse response){
         try {
             userService.addUser(user);
             jsonOutSuccess(response);
         } catch (Exception e) {
             e.printStackTrace();
         }

     }

}
