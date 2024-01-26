package com.ll.sbb3;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb3")
    @ResponseBody
    public String index(){
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }

}
