package com.example.demo.mapper;

import com.example.demo.model.dto.Test1Dto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface Test1Mapper {
    @Select("SELECT * FROM table1 order by create_at ")
    @Results(id = "table1Map", value = {
            @Result(column = "id", property = "id", javaType = String.class),
            @Result(column = "name", property = "name", javaType = String.class),
            @Result(column = "code", property = "code", javaType = String.class),
            @Result(column = "desc", property = "desc", javaType = String.class),
            @Result(column = "create_at", property = "createAt", javaType = Date.class),
            @Result(column = "update_at", property = "updateAt", javaType = Date.class),
    })
    List<Test1Dto> getAllTest1Data();
}
