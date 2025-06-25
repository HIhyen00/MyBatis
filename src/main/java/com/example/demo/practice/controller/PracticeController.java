package com.example.demo.practice.controller;


import com.example.demo.practice.dto.PracticeDTO;
import com.example.demo.practice.entity.PracticeEntity;
import com.example.demo.practice.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PracticeController {

    @Autowired
    private PracticeService practiceService;


    @PostMapping("/create")
    public ResponseEntity<String> get1(){

        PracticeDTO practiceDTO = new PracticeDTO("김혜인0101010", "AA28W4");
        boolean result = practiceService.create(practiceDTO);
        if (result) {
            return ResponseEntity.ok("생성 성공");
        } else{
            return ResponseEntity.badRequest().body("생성 실페");
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PracticeEntity>> getAll(){
        return ResponseEntity.ok(practiceService.getAll());
    }
}
