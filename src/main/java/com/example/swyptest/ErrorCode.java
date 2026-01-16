package com.example.swyptest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "C001", "입력 값에 대한 검증을 실패했습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "C002", "서버 내부 오류입니다."),

    USER_SUCCESS_SIGNUP(HttpStatus.CREATED, "U201", "회원가입 완료,"),
    USER_DUPLICATED_NICKNAME(HttpStatus.CONFLICT, "P409", "이미 존재하는 닉네임 입니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
}
