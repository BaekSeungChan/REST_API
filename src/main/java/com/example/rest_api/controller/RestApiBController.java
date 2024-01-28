package com.example.rest_api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/b")
public class RestApiBController {

    @GetMapping("/hello")
    public void hello(){
        throw new NumberFormatException("number format exception");
    }

//    @ExceptionHandler(value = {NumberFormatException.class}) // 부분적인 방법에서는 명시적으로 작성할 수 있다.
//    public ResponseEntity numberFormatException(
//            NumberFormatException e
//    ){
//        log.error("NumberFormatException", e);
//        return ResponseEntity.ok().build();
//
//    }
}
