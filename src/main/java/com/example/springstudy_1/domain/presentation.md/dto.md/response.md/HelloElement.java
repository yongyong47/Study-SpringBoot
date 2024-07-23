package com.example.springstudy_1.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HelloElement {
    private final Long id;
    private final String name;
    private final int age;
}
