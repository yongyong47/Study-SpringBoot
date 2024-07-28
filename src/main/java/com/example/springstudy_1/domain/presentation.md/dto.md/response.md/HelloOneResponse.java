package com.example.springstudy_1.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HelloOneResponse {
    private final long id;
    private final String name;
    private final int age;
}
