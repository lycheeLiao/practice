package com.example.demo.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Test1Dto {
    private String id;
    private String name;
    private String code;
    private String desc;
    private Date createAt;
    private Date updateAt;
}
