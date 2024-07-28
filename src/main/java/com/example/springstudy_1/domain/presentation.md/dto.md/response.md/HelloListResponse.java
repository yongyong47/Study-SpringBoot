package com.example.springstudy_1.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@Getter
@AllArgsConstructor
public class HelloListResponse {
    private final List<HelloElement> helloList;
}
