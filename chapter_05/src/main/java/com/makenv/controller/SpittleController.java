package com.makenv.controller;

import com.makenv.po.Spittle;
import com.makenv.service.serviceImpl.SpittleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    SpittleServiceImpl spittleService;

    @RequestMapping(method = RequestMethod.GET)
    public String selectSpittles(Model model) {
        model.addAttribute(spittleService.selectSpittles());
        return "spittles";
    }

    //访问如下形式的url，spittles/show?spittleId=2
    //RequestParam没有提供value时默认与参数名相同
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSpittle(@RequestParam int spittleId, Model model) {
        Spittle spittle = new Spittle();
        spittle = spittleService.selectOne(spittleId);
        model.addAttribute(spittleService.selectOne(spittleId));
        return "spittle";
    }

    //没有提供参数时，指定默认值
    @RequestMapping(value = "/show2", method = RequestMethod.GET)
    public String showSpittle2(@RequestParam(value = "spittleId", defaultValue = "1") int spId, Model model) {
        model.addAttribute(spittleService.selectOne(spId));
        return "spittle";
    }

    //使用占位符时，RequestMapping的value值需要和PathVariable的value值一样
    //访问如下形式的url，/spittles/1，PathVariable没有提供value时默认与参数名相同
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String showSpittle3(@PathVariable("spittleId") int spittleId, Model model) {
        model.addAttribute(spittleService.selectOne(spittleId));
        return "spittle";
    }

}