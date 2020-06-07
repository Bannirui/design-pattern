package com.example.design.pattern.example.service.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/1
 * @Description:
 */
@Data
@AllArgsConstructor
public abstract class Handler {
    Handler next;

    abstract boolean process(Request request);
}
