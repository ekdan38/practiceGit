package com.example.swyptest.service;

import com.example.swyptest.web.dto.SignupRequestDto;
import com.example.swyptest.web.dto.UserDto;

public interface SwypService {
    UserDto singUp(UserDto userDto);
}
