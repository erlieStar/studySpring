package com.makenv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller()
@RequestMapping("/index")
public class HomeController {

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public ModelAndView home1() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home1");
        //重定向到home2页面
        //modelAndView.setViewName("redirect:/index/index2");
        //转发到home2页面
        //modelAndView.setViewName("forward:/index/index2");
        return modelAndView;
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String home2() {
        //重定向到home1页面
        //return "redirect:/index/index1";
        //转发到home1页面
        //return "forward:/index/index1";
        return "home2";
    }

    @RequestMapping(value = {"index3","index4"}, method = RequestMethod.GET)
    public void home3(HttpServletResponse response) {
        //重定向到home1页面
        //return "redirect:/index/index1";
        //转发到home1页面
        //return "forward:/index/index1";
//        return "home2";
        try {
            response.getWriter().println("woca");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
