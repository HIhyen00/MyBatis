package com.example.demo.practice.entity;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
public class PracticeEntity {

    private Long id;
    private String name;
    private String code;

    public PracticeEntity() {
    }

    public PracticeEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
