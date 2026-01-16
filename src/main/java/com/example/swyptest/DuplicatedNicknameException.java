package com.example.swyptest;

public class DuplicatedNicknameException extends BusinessException{


    public DuplicatedNicknameException() {
        super(ErrorCode.USER_DUPLICATED_NICKNAME);
    }
}
