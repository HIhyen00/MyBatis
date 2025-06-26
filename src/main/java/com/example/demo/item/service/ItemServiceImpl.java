package com.example.demo.item.service;


import com.example.demo.item.dto.ItemDto;
import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;
import com.example.demo.item.repository.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemMapper itemMapper;

    public boolean save(ItemDto itemDto) {

        Item saveitem = new Item(itemDto.getItemName(), itemDto.getPrice(), itemDto.getQuantity());
        Boolean isSave = itemMapper.save(saveitem);
        if (!isSave) {
            return false;
        }
        return true;
    }

    public List<Item> findAll() {
        return itemMapper.findAll();
    }

    @Override
    public Optional<Item> findById(Long itemId) {
        return itemMapper.findById(itemId);
    }

    @Override
    public Boolean update(ItemUpdateDto itemUpdateDto) {
        return itemMapper.update(itemUpdateDto.getId(),
                new Item(itemUpdateDto.getItemName(), itemUpdateDto.getPrice(), itemUpdateDto.getQuantity()));
    }

    @Override
    public Boolean deleteById(Long itemId) {
        return itemMapper.deleteById(itemId);
    }


}
