package com.example.demo.item.controller;


import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;
import com.example.demo.item.service.ItemService;
import com.example.demo.item.service.ItemServiceImpl;
import com.example.demo.practice.dto.PracticeDTO;
import com.example.demo.practice.entity.PracticeEntity;
import com.example.demo.practice.service.PracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item")
public class ItemController {

    private final ItemService itemService;


    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody ItemDto itemDto) {

        boolean result = itemService.save(itemDto);

        if (result) {
            return ResponseEntity.ok("생성 성공");
        } else{
            return ResponseEntity.badRequest().body("생성 실페");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> findById(@PathVariable("id") Long id) {
        Optional<Item> findItem = itemService.findById(id);
        log.info("findItem:{}", findItem);
        if (findItem.isPresent()) {
            return ResponseEntity.ok(findItem.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/v2")
    public ResponseEntity<Item> findByIdV2(@RequestBody Long itemId) {
        Optional<Item> findItem = itemService.findById(itemId);
        log.info("findItem:{}", findItem);
        if (findItem.isPresent()) {
            return ResponseEntity.ok(findItem.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/All")
    public ResponseEntity<List<Item>> findAll(){
        return ResponseEntity.ok(itemService.findAll());
    }

    @PatchMapping("/update")
    public ResponseEntity<String> update(@RequestBody ItemUpdateDto itemUpdateDto) {
        boolean result = itemService.update(itemUpdateDto);
        if (result) {
            return ResponseEntity.ok("수정 완료");
        }
        return ResponseEntity.badRequest().body("수정 실패");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        Boolean result = itemService.deleteById(id);
        if (result) {
            return ResponseEntity.ok("삭제 성공");

        }
        return ResponseEntity.badRequest().body("삭제 실패");

    }




}
