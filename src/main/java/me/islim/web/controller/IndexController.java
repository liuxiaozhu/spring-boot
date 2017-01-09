package me.islim.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "", produces = "text/plain;charset=UTF-8")
    public String index(){
        return "Hello Spring Boot";
    }
}
