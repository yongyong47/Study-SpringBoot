package com.example.springstudy_1.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HelloNameResponse {
    private final int age;
    private final String name;
}
