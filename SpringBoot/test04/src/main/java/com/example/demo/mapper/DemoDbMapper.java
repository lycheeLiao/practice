package com.example.demo.mapper;

import com.example.demo.model.dto.Table1Dto;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface DemoDbMapper {

    List<Table1Dto> getAllTable1Data();

    List<Table1Dto> queryTable1Data(@Param("name")String name,@Param("code") String code );
}
