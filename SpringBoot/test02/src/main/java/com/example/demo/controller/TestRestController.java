package com.example.demo.controller;


import com.example.demo.model.common.ActionResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class TestRestController {
    @RequestMapping(value = { "/test1" }, method = { RequestMethod.GET }, produces="application/json;charset=UTF-8")
    @ResponseBody
    public ActionResult test1( ) {
        ActionResult<String> result=new ActionResult();
        result.setEntity("我是文本数据");
        return result;
    }
}
