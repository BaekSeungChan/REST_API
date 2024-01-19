package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import com.example.rest_api.model.Number;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    // @PathVariable(name = message) String msg
    // @PathVariable String message
    public String echo(
            @PathVariable String message,
            @PathVariable int age,
            // 래퍼런스 타입의 Integer는 null이 할당될 수 있습니다 그리고 int 타입의 age는 null이 할당될 수 없고 default가 0입니다.
            // PathValueable에 null이 들어올 수는 없다. 주소 자체가 해당 값이기 때문에 404 NOT FOUND가 나온다.
            @PathVariable boolean isMan
    ){
        System.out.println("message = " + message);
        System.out.println("age = " + age);
        System.out.println("isMan = " + isMan);
        // TODO 대문자로 변환해서 RETURN

        String strUpper = message.toUpperCase();


        return strUpper;
        // return message.toUpperCase();
    }

    // http://localhost:8080/api/echo/steve/age/20/is-man/true


    // http://localhost:8080/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31

    // 주소는 대문자를 쓰지 않는다.

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued_day") String issuedDay
    ){
        System.out.println("category = " + category);
        System.out.println("issuedYear = " + issuedYear);
        System.out.println("issudMonth = " + issuedMonth);
        System.out.println("issuedDay = " + issuedDay);
    }


    // 쿼리로 받아오는 다른 방
    // http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31
    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }


    // TODO Parameter 2가지 받습니다. int 형태로 받아서 두 수의 덧셈, 곱셈
    @GetMapping("/caculator")
    public void caclulator(
            Number number
    ){
        System.out.println(number);
    }
}
