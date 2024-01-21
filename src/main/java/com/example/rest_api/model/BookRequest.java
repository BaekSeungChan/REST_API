package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 전체 파라미터를 가지는 생성자를 자동으로 만들어준다.
@NoArgsConstructor // Allargument가 들어가게 되면 기본 생성자가 없어지기 때문에 기본 생성자도 달아주기 위한 어노테이션
public class BookRequest {
    private String name;
    private String number;
    private String category;
}
