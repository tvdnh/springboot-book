package com.test.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
//test
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
