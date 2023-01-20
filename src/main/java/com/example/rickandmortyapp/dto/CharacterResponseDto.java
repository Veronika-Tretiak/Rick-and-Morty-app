package com.example.rickandmortyapp.dto;

import com.example.rickandmortyapp.model.Gender;
import com.example.rickandmortyapp.model.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;
}
