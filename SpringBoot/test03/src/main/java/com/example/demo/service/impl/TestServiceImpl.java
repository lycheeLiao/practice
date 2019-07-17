package com.example.demo.service.impl;

import com.example.demo.mapper.Test1Mapper;
import com.example.demo.model.dto.Test1Dto;
import com.example.demo.service.TestService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Resource
    Test1Mapper test1Mapper;

    @Override
    public List<Test1Dto> getAllTest1Dto() {
        try{
          return   test1Mapper.getAllTest1Data();
        }
        catch (Exception e){
            log.error("执行方法发生错误",e);
        }
        return null;
    }
}
