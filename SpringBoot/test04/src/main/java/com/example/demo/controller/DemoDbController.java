package com.example.demo.controller;

import com.example.demo.model.dto.Table1Dto;
import com.example.demo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DemoDbController {

    @Resource
    TestService testService;

    @RequestMapping(value = { "/table1/list" }, method = { RequestMethod.GET })
    @ResponseBody
    public List<Table1Dto> Table1list( ) {
        return testService.getAllTest1Dto();
    }


}
