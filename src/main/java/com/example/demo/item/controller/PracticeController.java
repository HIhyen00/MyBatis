//package com.example.demo.item.controller;
//
//
//import com.example.demo.item.dto.ItemUpdateDto;
//import com.example.demo.item.entity.Item;
//import com.example.demo.item.service.PracticeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class PracticeController {
//
//    @Autowired
//    private PracticeService practiceService;
//
//
//    @PostMapping("/create")
//    public ResponseEntity<String> get1(){
//
//        ItemUpdateDto practiceDTO = new ItemUpdateDto("김혜인0101010", "AA28W4");
//        boolean result = practiceService.create(practiceDTO);
//        if (result) {
//            return ResponseEntity.ok("생성 성공");
//        } else{
//            return ResponseEntity.badRequest().body("생성 실페");
//        }
//    }
//
//    @GetMapping("/getAll")
//    public ResponseEntity<List<Item>> getAll(){
//        return ResponseEntity.ok(practiceService.getAll());
//    }
//}
