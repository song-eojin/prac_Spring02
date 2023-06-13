package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlController {
    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }
    @GetMapping("/html/redirect")
    public String htmlStatc() {
        return "redirect:/hello.html";
    }
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) { //Model 객체에 넣어줌
        visitCount++;
        model.addAttribute("visits", visitCount); //필요한/변동이 일어난 데이터를 넣어주기
        return "hello-visit"; //View 이름 적어주기
    }
}
