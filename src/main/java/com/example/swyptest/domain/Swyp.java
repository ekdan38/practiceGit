package com.example.swyptest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
// 기본 생성자 PROTECTED 처리
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Swyp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    // == private 생성자 ==
    @Builder
    public Swyp(String name, int age){
        this.name = name;
        this.age = age;
    }

    // == 생성 메서드 ==
    public static Swyp createSwyp(String name, int age){
        return new Swyp(name, age);
    }

}
