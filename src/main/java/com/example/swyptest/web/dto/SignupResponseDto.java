package com.example.swyptest.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SignupResponseDto {

    private String name;
    private int age;

    // 비즈니스DTO -> 응답DTO 변화
    public static SignupResponseDto from(UserDto userDto){
        return new SignupResponseDto(userDto.getName(), userDto.getAge());
    }
}
