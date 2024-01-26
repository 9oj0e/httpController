package com.mtcoding.conbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpQueryController {

    @GetMapping("/data/query/v1")
    public String queryV1(@RequestParam("keyword") String keyword) {
        return "받은 값 : " + keyword;
        // queryString이 전달되지 않으면 400error.
        // url마지막에 ?keyword=ssar을 append해서 재접속하면 해결
    }

    @GetMapping("/data/query/v2")
    public String queryV2(@RequestParam(value = "keyword", required = false) String keyword) {
        return "받은 값 : " + keyword;
        // queryString이 없더라도
        // required = false 속성이 null을 받아서 return한다.
    }

    @GetMapping("/data/query/v3")
    public String queryV3(@RequestParam(value = "keyword", required = false, defaultValue = "값 미입력") String keyword) {
        return "받은 값 : " + keyword;
        // queryString이 없더라도
        // defaultValue값으로 기본값을 할당받아 출력한다.
    }

    @GetMapping("/data/query/v4")
    public String queryV4(String keyword) {
        return "받은 값 : " + keyword;
        // @RequestParam은 생략 가능하다.
    }

    @GetMapping("/data/query/v5")
    public String queryV5(String keyword, String type) {
        return "받은 값 : " +
                keyword +
                ", 타입 : " +
                type;
    }
}