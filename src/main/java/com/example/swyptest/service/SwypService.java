package com.example.swyptest.service;

import com.example.swyptest.web.dto.SignupRequestDto;

public interface SwypService {
    Long singUp(SignupRequestDto requestDto);
}
