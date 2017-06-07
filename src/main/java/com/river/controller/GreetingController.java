package com.river.controller;

import com.river.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * Created by Administrator on 2017/6/7.
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";  // content 模板
    private final AtomicLong counter = new AtomicLong();  // 自动生成 id

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(
                counter.incrementAndGet(),    // 自增
                String.format(template, name) // content模板
        );
    }
}
