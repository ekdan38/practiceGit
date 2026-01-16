package com.example.swyptest.web.dto;

import com.example.swyptest.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class ApiResponse<T> {
    private boolean success;
    private String code;
    private String message;
    private T data;

    // 성공
    public static <T> ApiResponse<T> success(String message, T data){
        return ApiResponse.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .build();
    }

    // 비즈니스 실패
    public static <T> ApiResponse<T> fail(String errorCode, String ErrorMessage) {
        return ApiResponse.<T>builder()
                .success(false)
                .code(errorCode)
                .message(ErrorMessage)
                .build();
    }

    // 요청 필드 검증 실패
    public static <T> ApiResponse<T> validationFail(T errors) {
        return ApiResponse.<T>builder()
                .success(false)
                .code(ErrorCode.INVALID_INPUT_VALUE.getCode())
                .message(ErrorCode.INVALID_INPUT_VALUE.getMessage())
                .data(errors)
                .build();
    }

}