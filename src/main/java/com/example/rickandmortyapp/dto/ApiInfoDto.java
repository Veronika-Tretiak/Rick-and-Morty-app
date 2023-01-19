package com.example.rickandmortyapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiInfoDto {
    private int count;
    private int pages;
    private String next;
    private String prev;
}
