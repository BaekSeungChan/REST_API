package com.example.rest_api;

import com.example.rest_api.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoads () throws JsonProcessingException {
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("bsvll@dmdmd");
        user.setKorean(true);

        var json = objectMapper.writeValueAsString(user);
        System.out.println(json); // dto -> json

        var dto = objectMapper.readValue(json, UserRequest.class);
        System.out.println(dto); // json -> dto
    }

}
