package com.sparta.springmvc.controller;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api") //중복경로 처리
public class HelloController {
    @GetMapping("/hello2")
    //Http 의 메서드인 get, post, put, delete 를 annotation 으로 비교적 쉽게 받을 수 있다.

    @ResponseBody
    public String hello() {
        return "Hello World"; //나중에 여기가 View 정보를 전달해주는 부분이 될 것이다
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        return "Delete Method 요청";
    }
}
