package com.example.swyptest.web;

import com.example.swyptest.ErrorCode;
import com.example.swyptest.service.SwypService;
import com.example.swyptest.web.dto.ApiResponse;
import com.example.swyptest.web.dto.SignupRequestDto;
import com.example.swyptest.web.dto.SignupResponseDto;
import com.example.swyptest.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cicd")
@RequiredArgsConstructor
public class TestController {

    private final SwypService service;
//    @GetMapping("/test")
//    public String testController(){
//        return "ci/cd completed";
//    }
//
//    @GetMapping("/redirect")
//    public ResponseEntity<?> redirectController(){
//        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("www.naver.com")).build();
//    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody @Validated SignupRequestDto requestDto){
//
//        if (bindingResult.hasErrors()) {
//            return ResponseEntity.badRequest().body(bindingResult);
//        }

        UserDto userDto = service.singUp(requestDto.toServiceDto());
        SignupResponseDto signupResponseDto = SignupResponseDto.from(userDto);
        ApiResponse<SignupResponseDto> apiResponse =
                ApiResponse.success("회원가입 성공", signupResponseDto);
        return ResponseEntity.ok(apiResponse)
                ;
    }
}
