package com.example.demo.service.impl;

import com.example.demo.mapper.DemoDbMapper;
import com.example.demo.model.dto.Table1Dto;
import com.example.demo.service.TestService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Resource
    DemoDbMapper demoDbMapper;

    @Override
    public List<Table1Dto> getAllTest1Dto() {
        try{
          return   demoDbMapper.getAllTable1Data();
        }
        catch (Exception e){
            log.error("执行方法发生错误",e);
        }
        return null;
    }
}
