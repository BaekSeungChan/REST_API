package com.example.rest_api.model;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) // JSON으로 들어오는 거는 설정해줘야 한다.
@ToString
public class PostUesr {

    public String userName;
    public Integer userPhone; // 프리미티브 타입은 기본 int는 0 디폴트 값이기 때문에 JSON을 사용할 때는 래퍼런스 타입을 사용하는게 좋다.
    public String userEmail;
}

/*
{
    "user_name" : "도커 스터디",
    "user_phone" : 20,
    "user_email" : "djdjdj@Qnaverl"
}
* */