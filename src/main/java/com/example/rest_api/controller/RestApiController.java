package com.example.rest_api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController // REST API 컨트롤러라는 기능을 하는 특정한 클래스를 지정하기 위해서 사용.
@RequestMapping("/api") // 어떠한 주소 처리를 하겠다.
public class RestApiController {

    @GetMapping(path = "")
    public void hello(){
        var list = List.of("hello");
        var element = list.get(1);

        log.info("element : {}", element);

//        throw new RuntimeException("run time exception call");
    }
}
