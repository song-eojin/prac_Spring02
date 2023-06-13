package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class responseController {
    //Content-Type: text/html
    //Response Body
    //{"name":"Robbie", "age":"95"}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    //Content-Type: application/json
    //Response Body
    //{"name":"Robbie", "age":"95"}
    @GetMapping("/json/class")
    @ResponseBody //html 아닌 데이터를 받는다는 의미
    public Star helloClassJson() {
        return new Star("Robbie", 95); //클라이언트에서는 자바 언어를 자바스크립트로 변환해서 읽기 때문에 가능
    }
}
