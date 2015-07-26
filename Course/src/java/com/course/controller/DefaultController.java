/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.controller;

import com.course.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "front/index";
    }
    @RequestMapping(method = RequestMethod.POST,value = "Checking")
        public String filter(HttpServletRequest request,HttpServletResponse response){
            String username= request.getParameter("username");
            String password= request.getParameter("password");
            if(userService.authenticate(username, password)==null){
                return "redirect:";
            }else{
                HttpSession session= request.getSession();
                session.setAttribute("LoggedIn", true);
                return "redirect:admin/Dashboard";
            }
        }
        
    @RequestMapping(method = RequestMethod.GET,value = "Logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        HttpSession session= request.getSession(false);
        Boolean checking = (Boolean) session.getAttribute("LoggedIn");
        if(checking == null || checking == false){
            return "redirect:";
        }else{
            session.invalidate();
            return "redirect:";
        }
    }
        
    @RequestMapping(method = RequestMethod.GET,value = "admin/Dashboard")
    public String dashboard(){
        return "dashboard/dashboard";
    }
}
