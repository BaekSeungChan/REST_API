package com.example.rest_api.controller;

import com.example.rest_api.model.UpdateUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/userupdate")
    public void userupdate(
            @RequestBody UpdateUser updateUser
            ){
        log.info("Request: {}", updateUser);
    }
}


//  System.out 을 많이 찍을 수록 콘솔에 출력을 하고 다서 다음께 실행되기 때문에 많이 출력한다고 하면 서버의 진행 속도라든지 처리 속도가 저하 되ㅑㄴ다.
// 로고백을 통해서 로그를 찍게 되면 각 버퍼를 가지고 있기 때문에 해당 버퍼의 내용을 담고 바로 다음 메소드를 할 수 있도록 리턴이 됩니다.
// 그리고 버퍼의 내용이 이제 콘솔에 찍히게 된다. 그렇기 때문에 해당 버퍼 사이즈를 설정할 수 있다. 이러한 설정 때문에 프로그램이 진행되는 속도에 영향을 크게 주지 않는다.