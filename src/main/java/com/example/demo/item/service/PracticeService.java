//package com.example.demo.item.service;
//
//
//import com.example.demo.item.dto.ItemUpdateDto;
//import com.example.demo.item.entity.Item;
//import com.example.demo.item.repository.ItemMapper;
//import com.example.demo.item.repository.PracticeMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PracticeService {
//
//    @Autowired
//    ItemMapper itemMapper;
//
//    public boolean save(ItemUpdateDto itemUpdateDto) {
//
//        new Item()
//
//        boolean createResult = itemMapper.save(itemUpdateDto);
//        if (!createResult) {
//            return false;
//        }
//        return true;
//    }
//
//    public List<Item> getAll() {
//        return practiceMapper.getAll();
//    }
//
//
//
//}
