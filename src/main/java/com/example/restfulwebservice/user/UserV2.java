package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("UserInfo2")
public class UserV2 extends User {
    //User를 상속받기 때문에 User의 default 상속자가 있어야함
    private String grade;
}
