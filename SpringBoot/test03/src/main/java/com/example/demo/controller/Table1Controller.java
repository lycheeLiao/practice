package com.example.demo.controller;

import com.example.demo.model.dto.Test1Dto;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Table1Controller {

    @Resource
    TestService testService;

    @RequestMapping(value = { "/list" }, method = { RequestMethod.GET })
    @ResponseBody
    public List<Test1Dto> list( ) {
        return testService.getAllTest1Dto();
    }


}
