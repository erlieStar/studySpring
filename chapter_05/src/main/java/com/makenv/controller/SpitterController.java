package com.makenv.controller;

import com.makenv.po.Spitter;
import com.makenv.service.serviceImpl.SpitterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    SpitterServiceImpl spitterService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {

        //提交的表单不符合要求，重新跳转到注册页面
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterService.insertSpitter(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    //使用占位符时，RequestMapping的value值需要和PathVariable的value值一样
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterService.selectByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

    @RequestMapping(value = "/register2", method = RequestMethod.GET)
    public String showRegistrationForm2(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm2";
    }

}
