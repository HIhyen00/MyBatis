package com.example.demo.item.service;

import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    public boolean save(ItemDto itemDto);

    public List<Item> findAll();

    public Optional<Item> findById(Long itemId);

    public Boolean update(ItemUpdateDto itemUpdateDto);

    public Boolean deleteById(Long itemId);

}
