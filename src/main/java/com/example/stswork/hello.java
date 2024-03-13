package com.example.stswork;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

    @GetMapping("/myname")
    @ResponseBody
    public String test() {
        return "왤케 늦게바껴";
    }
}
