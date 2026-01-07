package com.example.swyptest.service;

import com.example.swyptest.domain.Swyp;
import com.example.swyptest.repository.SwypRepository;
import com.example.swyptest.web.dto.SignupRequestDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SwypServiceImplUnitTest {

    @Mock
    SwypRepository repository;

    @InjectMocks
    SwypServiceImpl service;

    @Test
    @DisplayName("회원가입 성공")
    public void signUp_success(){
        // given
        String name = "홍길동";
        int age = 99;
        Long id = 1L;

        SignupRequestDto requestDto = new SignupRequestDto(name, age);
        Swyp swyp = Swyp.createSwyp(name, age);
        ReflectionTestUtils.setField(swyp, "id", id);

        when(repository.save(any(Swyp.class))).thenReturn(swyp);

        // when
        Long savedId = service.singUp(requestDto);

        // then
        Assertions.assertThat(id).isEqualTo(savedId);
    }


}