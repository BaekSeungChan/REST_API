package com.example.rest_api.model;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UpdateUser {

    private String userName;
    private Integer userAge;
    private String userEmail;
    private Boolean isKorean; // boolean의 기본 값은 false이기 때무네 해당 값을 꼭 확인해줘야 한다.
}
