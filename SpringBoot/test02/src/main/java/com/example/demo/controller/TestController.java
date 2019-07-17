package com.example.demo.controller;

import com.example.demo.model.common.ActionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @RequestMapping(value = { "/hello" }, method = { RequestMethod.GET })
    @ResponseBody
    public String hello(@RequestParam(name = "username") String userName) {
        return  "hello," + userName;
    }


    @RequestMapping(value = { "/test1" }, method = { RequestMethod.GET }, produces="application/json;charset=UTF-8")
    @ResponseBody
    public ActionResult test1( ) {
        ActionResult<String> result=new ActionResult();
        result.setEntity("我是文本数据");
        return result;
    }

    /**
     * 会有中文乱码
     * @return
     */
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok().
                header("Content-Type", "text/plain").
                body("我是文本类型数据");
    }

    /**
     * 不会有中文乱码
     * @return
     */
    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public ResponseEntity<String> test3() {
        return ResponseEntity.ok().
                header("Content-Type", "text/plain;charset=UTF-8").
                body("我是文本类型数据");
    }
}
