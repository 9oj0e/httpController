package com.mtcoding.conbasic.controller;

import com.mtcoding.conbasic.dto.BoardReqDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpBodyController {
    @PostMapping("/data/body/v1")
    public String bodyV1(@RequestParam("title") String title) {
        return "받은 값 : " + title;
    }

    @PostMapping("/data/body/v2")
    public String bodyV2(@RequestParam("title") String title, @RequestParam("content") String content) {
        return "받은 값 : " + title + ", " + content;
    }

    @PostMapping("/data/body/v3")
    public String bodyV3(@RequestBody BoardReqDto boardReqDto) {
        return "받은 값 : " + boardReqDto.getTitle() + ", " + boardReqDto.getContent();
    }
}
