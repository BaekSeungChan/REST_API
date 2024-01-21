package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.PostUesr;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostApiController {

    //Get 방식은 데이터를 받을 때 특별한 객체 없이 또는 쿼리 파라미터를 객체를 통해서 받았는데
    //Post는 default가 객체를 받아야 한다.
    // @RequestBody : Post 또는 Put 방식에서 HTTP Body롣 르어오는 데이터를 해당 객체에다가 데이터 클래스에 맵핑해준다.
    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
            ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/user")
    public String user(
            @RequestBody PostUesr postUesr
            ){

        System.out.println(postUesr);
        return postUesr.toString();
    }
}
