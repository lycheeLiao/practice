package com.example.demo.model.common;

import lombok.Data;

@Data
public class ActionResult<T> {
    private boolean success;
    private String msg;

    private T entity;
}
