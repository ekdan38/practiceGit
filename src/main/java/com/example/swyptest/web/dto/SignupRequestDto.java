package com.example.swyptest.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupRequestDto {

    private String name;
    private int age;

}
