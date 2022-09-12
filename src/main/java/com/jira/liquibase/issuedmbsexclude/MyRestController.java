package com.jira.liquibase.issuedmbsexclude;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class MyRestController {

    @GetMapping("/")
    public String test() {
        return "it works!";
    }
}
