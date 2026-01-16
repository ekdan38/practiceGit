package com.example.swyptest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldErrorResponseDto {
    private String field;
    private String code;
    private String message;
    private Object rejectedValue;
}
