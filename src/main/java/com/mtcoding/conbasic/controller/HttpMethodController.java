package com.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.*;

@RestController
// 응답문 직접 처리. return에는 메시지가 그대로 담긴다.
public class HttpMethodController {
    @GetMapping("/req/get")
    public String methodGet() {
        return "<h1>get 요청<h1>" +
                "<hr>";
    }

    @PostMapping("/req/post")
    public String methodPost() {
        return "<h1>post 요청<h1>" +
                "<hr>";
    }

    @PutMapping("/req/put")
    public String methodPut() {
        return "<h1>put 요청<h1>" +
                "<hr>";
    }

    @DeleteMapping("/req/delete")
    public String methodDelete() {
        return "<h1>delete 요청<h1>" +
                "<hr>";
    }
}
