package com.example.swyptest.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class SignupRequestDto {

    @NotBlank(message = "name은 필수 입니다.")
    private String name;

    @NotNull(message = "age는 필수입니다.")
    @Positive(message = "age는 양수만 허용합니다.")
    private int age;

    // 비즈니스 DTO 변환
    public UserDto toServiceDto(){
        return new UserDto(name, age);
    }
}
