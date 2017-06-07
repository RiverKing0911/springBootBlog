package com.river.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by Administrator on 2017/6/7.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/{username}/blog/{blogId}")
    public String index(@PathVariable("username") String username,
                        @PathVariable("blogId") String blogId, ModelMap model) {
        model.addAttribute(username);
        model.addAttribute(blogId);
        return "index";
    }
}
