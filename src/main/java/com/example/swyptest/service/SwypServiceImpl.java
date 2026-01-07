package com.example.swyptest.service;

import com.example.swyptest.domain.Swyp;
import com.example.swyptest.repository.SwypRepository;
import com.example.swyptest.web.dto.SignupRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class SwypServiceImpl implements SwypService{

    private final SwypRepository repository;

    @Override
    public Long singUp(SignupRequestDto requestDto) {

        Swyp swyp = Swyp.createSwyp(requestDto.getName(), requestDto.getAge());
        repository.save(swyp);
        return swyp.getId();
    }
}
