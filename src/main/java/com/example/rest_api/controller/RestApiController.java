package com.example.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST API 컨트롤러라는 기능을 하는 특정한 클래스를 지정하기 위해서 사용.
@RequestMapping("/api") // 어떠한 주소 처리를 하겠다.
public class RestApiController {

    // 서버에 특정 데이터를 클라이언트는 요청을 하면 그에 대한 응답은 문자열로 해주게 된다.
    // 우리는 항상 데이터를 전달하는 것은 문자열로 전달이 된다. 그게 html, json, 특정한 파일 형태
    // 해석하는 쪽에서 해석하기 나름이다. 결국에는 이 문자는 전달이 될 때 0 또는 1 이라는 비트 단위의 데이터가 전달된다.
    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html><body><h1> Hello Spring Hello </h1></body></html>";

        return html;

//        return "hello Sprig boot";
    }


    // http://localhost:8080/api/echo/hello
    // PathVariable : 주소 내에 정보를 전달 하는 방법
    @GetMapping(path = "/echo/{message}")
    // @PathVariable(name = message) String msg
    // @PathVariable String message
    public String echo(@PathVariable String message){
//        System.out.println("message = " + message);
        // TODO 대문자로 변환해서 RETURN

        String strUpper = message.toUpperCase();

        return strUpper;
    }

}
