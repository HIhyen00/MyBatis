package com.example.demo.item.repository;


import com.example.demo.item.dto.ItemUpdateDto;
import com.example.demo.item.entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ItemMyBatisRepository implements ItemRepository  {


    private final ItemMapper itemMapper;


    @Override
    public Item save(Item item) {
        itemMapper.save(item);
        return item;
    }
    @Override
    public void update(Long itemId, ItemUpdateDto updateParam) {
        itemMapper.update(itemId, updateParam);
    }
    @Override
    public Optional<Item> findById(Long id) {
        return itemMapper.findById(id);
    }
//    @Override
//    public List<Item> findAll(ItemSearchCond cond) {
//        return itemMapper.findAll(cond);
//    }

}
